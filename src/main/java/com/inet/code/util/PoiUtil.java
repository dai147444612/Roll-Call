package com.inet.code.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PoiUtil {
    public static List readExcel(String filePath) throws IOException, InvalidFormatException {
        File f=new File(filePath);
        XSSFWorkbook hssfWorkbook = new XSSFWorkbook(f);
        XSSFSheet sheet = hssfWorkbook.getSheet("Sheet1");

        int lastRowIndex = sheet.getLastRowNum();
        List list=new ArrayList<>();
        for (int i = 0; i <= lastRowIndex; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row == null) { break; }
            short lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                XSSFCell cell = row.getCell(j);
                list.add(cell);
            }
        }
        return list;
    }


}
