package com.yikangyiliao.base.utils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


/**
 * @author liushuaic
 * @date 2015/07/24 12:19
 * */
@SuppressWarnings("unused")
public class InterfaceUtil {
	
	
	private static Map<String,String> serviceClassName=null;
	
	private static Map<String,String> mathodClassPath=null;
	
	static{
		serviceClassName=new HashMap<String,String>();
		mathodClassPath=new HashMap<String,String>();
		serviceClassName.put("0-0","test");
		mathodClassPath.put("0-0-1","test");
		
		/**
		 * 老人管理
		 * */
		serviceClassName.put("00-01", "seniorAccountService");
		/**
		 * 保存老人信息
		 * */
		mathodClassPath.put("00-01-01","saveSeniorAccount");
		/**
		 * @author liushuaic
		 * 获取某一个老人的信息
		 * */
		mathodClassPath.put("00-01-02","getSeniorAccountById");
		/**
		 * 查询某一个用户下的所有人
		 * */
		mathodClassPath.put("00-01-03","getSeniorAccountByUserId");
		
		//量表
		serviceClassName.put("00-02", "scaleService");
		//档案袋
		mathodClassPath.put("00-02-01", "saveAssessment");
		
		
		/**
		 * 生活护理评估
		 * */
		serviceClassName.put("00-03", "lifeNurseAssessmentService");
		mathodClassPath.put("00-03-01", "getQuestionCrosswiseByTableName");
		mathodClassPath.put("00-03-02", "getQuestionUnitAnswerMapByQuetionCrosswiseId");
		
		
		/**
		 * 数据保存
		 * */
		serviceClassName.put("00-04", "answerService");
		mathodClassPath.put("00-04-01", "saveAnswer");
		mathodClassPath.put("00-04-02", "saveAnswerForQuestion");
		
		/**
		 * 老年人跌倒风险评估
		 * */
		serviceClassName.put("00-05", "oldManTumbleService");
		mathodClassPath.put("00-05-01", "getTable");
		
		
		/**
		 * 疾病评估
		 * */
		serviceClassName.put("00-06", "sicknessAssessmentService");
		mathodClassPath.put("00-06-01", "getTable");
		
		/**
		 * 抑郁评估
		 * **/
		serviceClassName.put("00-07", "depressionAssessmentService");
		mathodClassPath.put("00-07-01", "getTable");
		
		
		/**
		 * 抑郁自测
		 * **/
		serviceClassName.put("00-08", "depressionSelfTestingService");
		mathodClassPath.put("00-08-01", "getTable");
		
		
		/**
		 * 老年人常见问题
		 * **/
		serviceClassName.put("00-09", "oldManCommonQuestionService");
		mathodClassPath.put("00-09-01", "getTable");
		
		
		/**
		 * 感知与沟通
		 * */ 
		serviceClassName.put("00-10", "pserceptionCommunicationsService");
		mathodClassPath.put("00-10-01", "getTable");
		
		/**
		 * 社会参与
		 * */
		serviceClassName.put("00-11", "socialParticipationService");
		mathodClassPath.put("00-11-01", "getTable");
		
		/**
		 * 日常生活
		 * */
		serviceClassName.put("00-12", "dailyIndexesService");
		mathodClassPath.put("00-12-01", "getTable");
		
		/**
		 * 精神状态
		 */
		serviceClassName.put("00-13", "mentalIndexesService");
		mathodClassPath.put("00-13-01", "getTable");
		
		/**
		 * 长谷川
		 * **/
		serviceClassName.put("00-14", "alzheimerDiseaseService");
		mathodClassPath.put("00-14-01", "getTable");
		
		
		/**
		 * 档案袋管理
		 * 
		 * */
		
		serviceClassName.put("00-15", "assessmentService");
		mathodClassPath.put("00-15-01", "saveAssessment");
		mathodClassPath.put("00-15-02", "getAssessmentBySeniorId");
		
		
		serviceClassName.put("login", "login");
		mathodClassPath.put("login", "login");
		
		/**
		 * @author liushuaic
		 * @date 2015/08/18 18:03
		 * 评估表管理
		 * */
		serviceClassName.put("00-16", "surveyTableService");
		mathodClassPath.put("00-16-01", "getTableList");
		mathodClassPath.put("00-16-02", "getQuestionsAndAnswersIsCheck");
		mathodClassPath.put("00-16-03", "getQuestionAndAnswersIsCheckTwo");
		mathodClassPath.put("00-16-04", "getQuestionAndAnswersIsCheckThree");
		
		
		/**
		 * @author liushuaic
		 * @date 2015/08/26 10:42
		 * 用户管理
		 * 
		 * **/
		
		serviceClassName.put("regist", "userService");
		mathodClassPath.put("regist", "registerUser");
		
		serviceClassName.put("registerUserAndSaveServiceInfo", "userService");
		mathodClassPath.put("registerUserAndSaveServiceInfo", "saveRegisterUserAndSaveServiceInfo");
		
		serviceClassName.put("00-17", "userService");
		mathodClassPath.put("00-17-01", "registerUser");
		mathodClassPath.put("00-17-02", "saveServiceUserInfo");
		mathodClassPath.put("00-17-03", "registerUserAndSaveServiceInfo");
		// 获取某一个服务人员信息 
		mathodClassPath.put("00-17-04", "getUserServiceInfoByUserId");
		
		
		/**
		 * @author liushuaic
		 * @date 2015/09/01 14:19
		 * @desc 设备管理
		 * **/
		serviceClassName.put("00-18", "deviceService");
		//保存设备
		mathodClassPath.put("00-18-01", "saveDevice");
		//获取别名
		mathodClassPath.put("00-18-02", "getAliasByUser");
		
		
		/**
		 * 
		 * @author liushuaic
		 * @date 2015/09/18 11:58
		 * @desc 服务人员日程管理
		 * **/
		
		serviceClassName.put("00-19", "serviceScheduleService");
		mathodClassPath.put("00-19-01", "getScheduleListByMonth");
		mathodClassPath.put("00-19-02", "getServiceScheduleDetail");
		mathodClassPath.put("00-19-03", "insertServiceScheduleDetail");
		
		/**
		 * @author liushuaic
		 * @date 2015/10/10 17:23
		 * 预约日期查询
		 * **/
		serviceClassName.put("00-20", "timeQuantumService");
		mathodClassPath.put("00-20-01", "getTimeQuantumsForCustomer");
		
		
		
		/**
		 * @author liushuaic
		 * @date 2015/10/12 15:11
		 * 预约管理
		 * **/
		serviceClassName.put("00-21","appointmentOrderService");
		mathodClassPath.put("00-21-01", "addPointmentOrder");
		mathodClassPath.put("00-21-02", "getServiceUserByOrderId");
		mathodClassPath.put("00-21-03", "addPointmentOrderAndSubmitAssessment");
		
		
		/**
		 * @author liushuaic
		 * @date 2015/10/14 20:18
		 * 服务人员服务
		 * */
		serviceClassName.put("00-22","servicerService");
		mathodClassPath.put("00-22-01","getAssessmentService");
		
		
		
		
	}
	
	
	
	public void loadConfigInterface(String filePath){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
			SAXParser saxParser = factory.newSAXParser();
	        InputStream is = InterfaceUtil.class.getClassLoader().getResourceAsStream("student.xml");
	        //saxParser.parse(is);
	        // TODO 后期添加本功能
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 *
	 *@author liushuaic
	 *@date 2015/07/24 15:33
	 *@desc 返回serviceName
	 *
	 ***/
	public static String getBeanNameByServiceCode(String serviceCode){
		if(serviceCode.indexOf('-')!=-1){
			serviceCode=serviceCode.substring(0,serviceCode.lastIndexOf('-'));
		}
		return serviceClassName.get(serviceCode);
	}

	
	/***
	 *@author liushuaic
	 *@date 2015/07/24 15:32
	 *返回方法名称
	 * */
	public static String getMethodNameByServiceCode(String serviceCode){
		return mathodClassPath.get(serviceCode);
	}
	
	
	public static void main(String[] args) {
		String codeStr="00-02-01";
		System.out.println(codeStr.substring(0,codeStr.lastIndexOf('-')));
	}
	
	
}
