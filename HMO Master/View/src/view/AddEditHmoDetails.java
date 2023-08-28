package view;

import com.view.utils.ADFUtils;
import com.view.utils.JSFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class AddEditHmoDetails {
    public AddEditHmoDetails() {
        
    }
    
    public void setOrgId() {
        Object obj = ADFContext.getCurrent()
                               .getSessionScope()
                               .get("personId");
        System.out.println("obj------------ " + obj);
        ViewObject empployeeROVO =
            ADFUtils.getApplicationModuleForDataControl("Oando_AMDataControl").findViewObject("Employee_View_ROVO");
        System.err.println("Emp Count BF ="+empployeeROVO.getEstimatedRowCount());
        ViewCriteria viewCriteria = empployeeROVO.createViewCriteria();
        ViewCriteriaRow viewCriteriaRow = viewCriteria.createViewCriteriaRow();
        viewCriteriaRow.setAttribute("PersonId", obj);
        viewCriteria.addRow(viewCriteriaRow);
        empployeeROVO.applyViewCriteria(viewCriteria);
        empployeeROVO.executeQuery();
         System.out.println("LineVo Query ----" + empployeeROVO.getQuery());
        System.out.println("Person Id Id ----" + obj);
        System.err.println("Emp Count AF="+empployeeROVO.getEstimatedRowCount());

        if (empployeeROVO.getEstimatedRowCount() > 0) {
            Row row = empployeeROVO.first();
            row.getAttribute("BusinessUnitId");
            row.getAttribute("PersonNumber");
            row.getAttribute("FullName");
            row.getAttribute("EmailAddress");
            row.getAttribute("BusinessUnitName");
            //            row.getAttribute("DepartmentName");
            //            System.out.println(row.getAttribute("PersonNumber"));
            //            System.out.println(row.getAttribute("FullName"));
                       System.out.println(row.getAttribute("EmailAddress"));
            //            System.out.println(row.getAttribute("BusinessUnitName"));
            //            System.out.println(row.getAttribute("DepartmentName"));
            Object orgObj = row.getAttribute("BusinessUnitId");
            ADFContext.getCurrent()
                      .getSessionScope()
                      .put("orgId", orgObj);


            System.out.println("111111111");
            ViewObject hmoOptionsVO =
                ADFUtils.getApplicationModuleForDataControl("Oando_AMDataControl").findViewObject("HMOOptionMasterVO");
            // Row r = buddyCareVO.first();
            Row newRow = hmoOptionsVO.createRow();
            newRow.setAttribute("PersonId", obj);
            newRow.setAttribute("Name_Trns", row.getAttribute("FullName"));
            newRow.setAttribute("Number_Trns", row.getAttribute("PersonNumber"));
            newRow.setAttribute("Email_Trns", row.getAttribute("EmailAddress"));
            newRow.setAttribute("Group_Trns", row.getAttribute("BusinessUnitName"));
            newRow.setAttribute("BusinessUnitId", row.getAttribute("BusinessUnitId"));
           // newRow.setAttribute("DepartmentName", row.getAttribute("DepartmentName"));
          //  newRow.setAttribute("LineManager", row.getAttribute("SupervisorName"));
            newRow.setAttribute("Cadre_Trns", row.getAttribute("Cadre"));
            hmoOptionsVO.insertRow(newRow);
        }

    }

    public void onClickSave(ActionEvent actionEvent) {
        ADFUtils.findOperation("Commit").execute();
        JSFUtils.addFacesInformationMessage("Information Successfully Created");
    }

    public void onClickCancel(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject HdrVO = ADFUtils.findIterator("HMOOptionMasterVOIterator").getViewObject();
        HdrVO.applyViewCriteria(null);
                HdrVO.executeQuery();
        ADFUtils.findOperation("Rollback").execute();
    }
}
