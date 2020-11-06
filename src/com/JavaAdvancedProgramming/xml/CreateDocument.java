package com.JavaAdvancedProgramming.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

public class CreateDocument {
    public static void main(String[] args) {
        //创建xml文档对象
        Document document= DocumentHelper.createDocument();

        //创建根节点
        Element rootElement = DocumentHelper.createElement("heroes");

        //设置文档genjiedian
        document.setRootElement(rootElement);

        //创建元素
        Element heroEle = DocumentHelper.createElement("hero");

        //添加元素属性
        heroEle.addAttribute("id", "1");
        heroEle.addAttribute("name", "韩信");

        //添加元素到根节点
        rootElement.add(heroEle);

        //创建输出格式对象，用于格式化输出
        OutputFormat format=OutputFormat.createPrettyPrint();

        //设置文档的编码格式
        format.setEncoding("utf-8");

        try {
            //创建XMLWriter对象，用于输出XML文档
            XMLWriter writer = new XMLWriter(new FileWriter("heroes.xml"), format);
            //将Document文档输入到heroes.xml文件中
            writer.write(document);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
