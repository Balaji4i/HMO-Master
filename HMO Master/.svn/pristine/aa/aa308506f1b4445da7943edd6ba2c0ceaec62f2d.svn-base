package view;

import com.view.utils.ADFUtils;
import com.view.utils.JSFUtils;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.jbo.ViewObject;

public class AddEditHmo {
    public AddEditHmo() {
    }

    public void onClickSave(ActionEvent actionEvent) {
        ADFUtils.findOperation("Commit").execute();
       JSFUtils.addFacesInformationMessage("Data Saved Successfully");
    }

    public void onClickCancel(ActionEvent actionEvent) {
        ViewObject HdrVO = ADFUtils.findIterator("HMOMaster_VOIterator").getViewObject();
        HdrVO.applyViewCriteria(null);
//        HdrVO.executeQuery();
        ADFUtils.findOperation("Rollback").execute();
    }

    public void onClickActivate(ActionEvent actionEvent) {
        ViewObject HdrVO = ADFUtils.findIterator("HMOMaster_VOIterator").getViewObject();
        HdrVO.getCurrentRow().setAttribute("Active" , "Y");
        ADFUtils.findOperation("Commit").execute();
        JSFUtils.addFacesInformationMessage("Plan Activated Successfully");
    }
    public void onClickInactive(ActionEvent actionEvent) {
        ViewObject HdrVO = ADFUtils.findIterator("HMOMaster_VOIterator").getViewObject();
        HdrVO.getCurrentRow().setAttribute("Active" , "N");
        ADFUtils.findOperation("Commit").execute();
        JSFUtils.addFacesInformationMessage("Plan Inactivated Successfully");
    }

    public void switchVcl(ValueChangeEvent valueChangeEvent) {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
    }
}
