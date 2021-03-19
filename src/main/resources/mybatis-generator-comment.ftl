<?xml version="1.0" encoding="UTF-8"?>
<template>
    <comment ID="addJavaFileComment"></comment>
    <comment ID="addComment"></comment>
    <comment ID="addRootComment"></comment>
    <comment ID="addFieldComment">
        <![CDATA[
        <#if introspectedColumn??>
            <#if introspectedColumn.remarks?? && introspectedColumn.remarks != ''>
                <#list introspectedColumn.remarks ? split("\n") as remark>
                    /**  ${remark}  **/
                </#list>
            </#if>
        </#if>
        ]]>
    </comment>

    <comment ID="addModelClassComment">
        <![CDATA[
        <#if introspectedTable.remarks?? && introspectedTable.remarks != ''>
            <#list introspectedTable.remarks?split("\n") as remark>
                /**
                * ${remark}
                **/
            </#list>
        </#if>

        ]]>
    </comment>

    <comment ID="addClassComment">
        <![CDATA[
        /**
        * ${introspectedTable.fullyQualifiedTable}
        **/
        ]]>
    </comment>

    <comment ID="addEnumComment"></comment>
    <comment ID="addInterfaceComment"></comment>
    <comment ID="addGetterComment"></comment>
    <comment ID="addSetterComment"></comment>
    <comment ID="addGeneralMethodComment"></comment>
</template>