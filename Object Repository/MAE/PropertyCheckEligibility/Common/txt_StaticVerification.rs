<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>txt_StaticVerification</name>
   <tag></tag>
   <elementGuidId>1692fa3b-c3f5-4e56-a9c5-5b842783ee4c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>android.widget.TextView</value>
      <webElementGuid>f8630dbf-5daf-41e5-9c20-2ab3f9bbc094</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${variable}</value>
      <webElementGuid>1fae7d4b-b4a7-48ea-857c-0ffc0041fda7</webElementGuid>
   </webElementProperties>
   <locator>//*[@class = 'android.widget.TextView' and (@text = '${variable}' or . = '${variable}')]</locator>
   <locatorStrategy>XPATH</locatorStrategy>
</MobileElementEntity>
