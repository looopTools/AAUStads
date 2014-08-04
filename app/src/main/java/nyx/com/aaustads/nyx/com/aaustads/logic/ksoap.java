package nyx.com.aaustads.nyx.com.aaustads.logic;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by tools on 04/08/14.
 */
public class ksoap {

    private static final String NAMESPACE = "https://sb.aau.dk/sb-ad/sb/";
    private static final String URL = "https://sb.aau.dk/sb-ad/sb/index.jsp";

    public static boolean isUserInStads(String username, String password){

        String METHOD_NAME = "index";
        String SOAP_ACTION = "https://sb.aau.dk/sb-ad/sb/index.jsp";

        //https://sb.aau.dk/sb-ad/sb/index.jsp?
        // adgangskode=password
        // &brugernavn=username
        // &lang=null
        // &submit_action=login
        final String LANG_ATTR = "lang";
        final String SUBMIT_ACTION_ATTR = "submit_action";
        final String USER_NAME_ATTR = "brugernavn"; //DANISH: Username
        final String PASSWORD_ATTR = "adgangskode"; //DANISH: Password

        SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
        request.addProperty(USER_NAME_ATTR, username);
        request.addProperty(PASSWORD_ATTR, password);

        request.addProperty(LANG_ATTR, "null");
        request.addProperty(SUBMIT_ACTION_ATTR, "login");

        System.out.println(request.toString());
        request.

        /*SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

        envelope.setOutputSoapObject(request);
        envelope.dotNet = false; //It is a jsp (java) service

        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try{
            androidHttpTransport.call(SOAP_ACTION, envelope);

            SoapObject resultsRequestSOAP = (SoapObject) envelope.getResponse();
            for(int i = 0; i < resultsRequestSOAP.getPropertyCount(); i++){
                System.out.println(resultsRequestSOAP.getProperty(i).toString());
            }
            //SoapObject propertyList = (SoapObject)

        }catch (Exception e){
            e.printStackTrace();
        }
        */
        return false;
    }

}
