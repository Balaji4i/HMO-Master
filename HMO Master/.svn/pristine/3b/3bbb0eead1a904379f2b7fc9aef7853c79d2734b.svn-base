package view;



import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

public class ApprovalPayload {
    public ApprovalPayload() {
        super();
    }
    public static final String userName="oaopdtst";
    public static final String password="O_0Pst#819";
    
    //bUSINESS
    /***Cloud purpose un comment these section while deploying to cloud **/    
    //public static final String TRAVEL_REQ_WSDL = "http://oaosoatest-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/IntroductionLetterApproval/bpelprocess1_client_ep?WSDL";
    public static final String DUTY_ALLOWANCE_WSDL ="https://oaosoatest.oandoplc.com/soa-infra/services/default/IntroductionLetterApproval/bpelprocess1_client_ep?WSDL";
    public static final String DUTY_ALLOWANCE_METHOD = "process";
   
    public static String businessTypeXMLData(String p_EmployeeName,String p_EmployeeNumber,String p_Email,String p_BusinessGroup,String p_TransDate,String p_AllowanceTyp,String p_Rate, String p_StartDate,
                                             String p_EndDate,String p_Days,String p_AllowancAmount,String p_Comments
                                               )
                                              {
        String[] info=payloadHeader();
        String totalXml=null;
        String xmlData2="\n";
        System.err.println("Created time===>"+info[0]);
        System.err.println("User===========>"+info[1]);
        System.err.println("Password=======>"+info[2]);
        System.err.println("End time=======>"+info[3]);  
        String xmlData="<soapenv:Envelope xmlns:app=\"http://xmlns.oracle.com/introductionletterapproval\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
        "   <soapenv:Header/>\n" +  
        "   <soapenv:Body>\n" + 
       " <app:processRequest>\n" + 
       "         <app:EmployeeName>"+p_EmployeeName+"</app:EmployeeName>\n" + 
       "         <app:EmployeeNumber>"+p_EmployeeNumber+"</app:EmployeeNumber>\n" + 
       "         <app:CountryDestination>"+p_Email+"</app:CountryDestination>\n" + 
       "         <app:EmailAddress>"+p_BusinessGroup+"</app:EmailAddress>\n" + 
    
       "         <!--1 or more repetitions:-->\n" + 
       "         <app:processLines>\n" + 
       "            <app:Relationship>"+p_TransDate+"</app:Relationship>\n" + 
       "            <app:FullName>"+p_AllowanceTyp+"</app:FullName>\n" + 
       "            <app:DateOfBirth>"+p_Rate+"</app:DateOfBirth>\n" + 
       "            <app:PlaceOfBirth>"+p_StartDate+"</app:PlaceOfBirth>\n" + 
       "            <app:PassportNo>"+p_EndDate+"</app:PassportNo>\n" + 
       "            <app:PassportIssueDate>"+p_Days+"</app:PassportIssueDate>\n" + 
       "            <app:PassportExpiryDate>"+p_AllowancAmount+"</app:PassportExpiryDate>\n" + 
       "            <app:ProposalTravelDate>"+p_Comments+"</app:ProposalTravelDate>\n" + 
       
       "         </app:processLines>\n" + 
       "      </app:processRequest>\n"+
            "   </soapenv:Body>\n" + 
        "</soapenv:Envelope>";
        //totalXml= xmlData+xmlData2+"\n"+xmlData3;
       // System.err.println("Totalxml"+totalXml);
        return xmlData;
    }
      
    public static String[] payloadHeader(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'"); //Hours:Minutes:Seconds
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.util.Date expDate ;
        expDate = new java.util.Date(t + (10 * 600000000));

    ////        date = new Date();
    //         dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    //         String expDate = dateFormat.format(DateUtils.addMinutes(date, 2));


        java.util.Date plusOne;
    //        String createdTS = dateFormat.format(date);
    //        String expiresTS = dateFormat.format(expDate);
    //        String username="praveen.c@4iapps.com";
    //        String password="Welcome#1234";
         String [] headerInfo=new String[4];
        headerInfo[0]=dateFormat.format(date);
        headerInfo[1]="oaopdtst";
        headerInfo[2]="O_0Pst#819";
        headerInfo[3]=dateFormat.format(expDate);
        return headerInfo;
    }
    
    public static String getUser(){
        
        return null;
    }
    
    
    

    
    
}
