package view;

import com.view.utils.ADFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class SearchHmoOptions {
    public SearchHmoOptions() {
        super();
    }

    public void onClickEdit(ActionEvent actionEvent) {
        Object obj =  ADFContext.getCurrent().getPageFlowScope().get("headerId");
          System.err.println("Object Name"+obj);
                 ViewObject HdrVO = ADFUtils.findIterator("HMOOptionMasterVOIterator").getViewObject();
        
                 ViewCriteria hdrVC = HdrVO.createViewCriteria();
                 ViewCriteriaRow hdrVcr = hdrVC.createViewCriteriaRow();
                 hdrVcr.setAttribute("HmoOptionsId", obj);
                 hdrVC.addRow(hdrVcr);
                 HdrVO.applyViewCriteria(hdrVC);
        // Add event code here...
    }

    public void onClickDelete(ActionEvent actionEvent) {
        // Add event code here...
        ADFUtils.findOperation("Delete").execute();
        ADFUtils.findOperation("Commit").execute();
    }
}
