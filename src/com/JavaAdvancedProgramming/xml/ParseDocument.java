package com.JavaAdvancedProgramming.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class ParseDocument {
    public static void main(String[] args) {

        SAXReader reader = new SAXReader();
        try {
            //通过read方法读取文件，转化成Document对象
            Document document = reader.read(new File("res/heroes.xml"));
            //获取根节点元素
            Element rootElement=document.getRootElement();

            //调用方法
            parseElement(rootElement);

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public  static void parseElement(Element element){
        //获取元素中的所有元素
        List<Element> elementList=element.elements();

        for (int i = 0; i < elementList.size(); i++) {
            //获取集合中的单个元素
            Element  ele = elementList.get(i);
//                //通过已知属性名获取属性值
//                System.out.print("id:"+element.attributeValue("id")+"\t");
//                System.out.println("name:"+element.attributeValue("name"));

            //未知属性名获取属性值

            //把元素中的属性放入集合中
            List<Attribute> attributeList=ele.attributes();

            for (int j = 0; j < attributeList.size(); j++) {
                //获取集合中的单个属性
                Attribute attribute = attributeList.get(j);
                //输出属性的名字和值
                System.out.print(attribute.getName()+attribute.getValue());
            }
            //获取ele下面的文字，如果没有文字，打印换行
            if (!"".equals(ele.getTextTrim())){
                System.out.println(ele.getText());
            }else {
                System.out.println();
            }
            //递归调用
            parseElement(ele);
        }
    }
}
