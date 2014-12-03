/**
 * 
 */
package com.cdio.planx.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import com.cdio.planx.domain.Competition;
import com.cdio.planx.domain.Resource;
import com.cdio.planx.exception.CdioException;

/**
 * @author Administrator
 * 
 */
public class CdioUtils {

	public static String FILEPATH = "E:\\上传资源\\";

	/**
	 * 空字符串检测
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmptyStr(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static String getFileName(String src) {
		String[] srcs = src.split("\\\\");
		return srcs[srcs.length - 1];
	}

	

	public static void FileDownload() {

	}
	
	public static Competition CompetitionFileUpload(HttpServletRequest request,String filePath,String author) {
		Competition competition = new Competition();
		competition.setCompetitionAuthor(author);
		competition.setCompetitionDate(new Date());
		
		try {
	        DiskFileUpload fu = new DiskFileUpload();
	        fu.setSizeMax(4194304);
	        fu.setSizeThreshold(4096);
	        List fileItems = fu.parseRequest(request);
	        Iterator i = fileItems.iterator();
	        while(i.hasNext()) {
	            FileItem fi = (FileItem)i.next();
	            if (fi.isFormField()) {  
	            	String name = fi.getFieldName();
	            	String value=fi.getString();
	            	if(name.equals("title"))
	            		competition.setCompetitionTitle(value);
	            	if(name.equals("content"))	
	            		competition.setCompetitionContent(value);
	            } 
	            String fileName = fi.getName();
	            if(fileName!=null) {
	                fi.write(new File(filePath + fileName));
	            }
	            competition.setCompetitionFile(fileName);
	        }
	    }
	    catch(Exception e) {
	    	e.getStackTrace();
	    }
		return competition;
	}
	
	public static Resource ResFileUpload(HttpServletRequest request,String filePath,String author) {
		Resource resource = new Resource();
		resource.setResAuthor(author);
		resource.setResDate(new Date());
		
		try {
	        DiskFileUpload fu = new DiskFileUpload();
	        fu.setSizeMax(4194304);
	        fu.setSizeThreshold(4096);
	        List fileItems = fu.parseRequest(request);
	        Iterator i = fileItems.iterator();
	        while(i.hasNext()) {
	            FileItem fi = (FileItem)i.next();
	            if (fi.isFormField()) {  
	            	String name = fi.getFieldName();
	            	String value=fi.getString();
	            	if(name.equals("title"))
	            		resource.setResName(value);
	            	if(name.equals("type"))	
	            		resource.setResType(value);
	            	if(name.equals("describe"))	
	            		resource.setResDescribe(value);
	            } 
	            String fileName = fi.getName();
	            if(fileName!=null) {
	                fi.write(new File(filePath + fileName));
	            }
	            resource.setResFile(fileName);
	        }
	    }
	    catch(Exception e) {
	    	e.getStackTrace();
	    }
		return resource;
		
		
		
	}

}
