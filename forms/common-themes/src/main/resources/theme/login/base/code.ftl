<#import "template.ftl" as layout>
<@layout.registrationLayout; section>
    <#if section = "title">
        <#if code.success>
            Success code=${code.code}
        <#else>
            Error error=${code.error}
        </#if>
    <#elseif section = "form">
        <div id="kc-code">
            <#if code.success>
                <p>Please copy this code and paste it into your application:</p>
                <textarea id="code">${code.code}</textarea>
            <#else>
                <p>${code.error}</p>
            </#if>
        </div>
    </#if>
</@layout.registrationLayout>
