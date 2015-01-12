package com.company.Web;
import javax.xml.namespace.QName;
import java.io.File;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

/**
 * Created by blin on 2015/1/12.
 */
public class NetWebService {
    /**
     * web service
     *
     * @param cid
     * @param RowfilingDocumentId
     * @param filePath
     */
    public static boolean make1(String cid, String rowFilingDocumentId, String filePath)
    {
        try
        {
            String nameSpace="http://tempuri.org/";
            String endpoint="http://*****/WebService/AsRptToStdService.asmx";

            Service service = new Service();
            Call call = new Call(service);
            call.setTargetEndpointAddress(new URL(endpoint));

            call.setUseSOAPAction(true);
            call.setSOAPActionURI("http://tempuri.org/AsRptToStd");

            call.setOperationName(new QName(nameSpace, "AsRptToStd"));
            //输入参数设置
            call.addParameter(new QName(nameSpace, "strCID"),
                    XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
            call.addParameter(new QName(nameSpace, "longRowFileDocumentId"),
                    XMLType.XSD_LONG, javax.xml.rpc.ParameterMode.IN);
            call.addParameter(new QName(nameSpace, "strAsRptFilePath"),
                    XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
            //输出结果设置
            call.setReturnType(new QName(nameSpace, "AsRptToStdResult"), Boolean.class);

            //执行
            boolean output = (Boolean) call.invoke(new Object[]
                    { cid, rowFilingDocumentId, filePath });

            System.out.println(output);
            return output;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return false;
    }
    public static void main(String[] args)
    {

        make1("0C000007XQ","3769732",
                "////cnmsinputfs3//EquityDataBeta//Equity//working//AsRpt//std.xml");

    }
}

