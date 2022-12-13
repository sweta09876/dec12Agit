/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Sweta
 */
public class FileUtil { 
    public static FacebookVO loadData() throws Exception{
    FileInputStream inputStream = new FileInputStream(new File("c:\\data\\facebook.xlsx"));
        Workbook workbook = new XSSFWorkbook(inputStream);
        //getting first worksheet
        Sheet firstSheet = workbook.getSheetAt(0);// first tab
        //get first row(with values)
        Row r =  firstSheet.getRow(1);
        Cell c = r.getCell(0); //username value
        String username = c.getStringCellValue();
        c = r.getCell(1); //password value
        String password = c.getStringCellValue();
        
        FacebookVO facebook = new FacebookVO(username, password);
        
        System.out.println(facebook);
        inputStream.close();
        return facebook; 
}
}