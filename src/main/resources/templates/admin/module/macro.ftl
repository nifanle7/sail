<#macro header>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/plugins/sweetalert2/sweetalert2.css">
    <link rel="stylesheet" href="/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="/plugins/simplemde/simplemde.min.css">
    <link rel="stylesheet" href="/plugins/layui/css/layui.css">
    <link rel="stylesheet" href="/css/app.css">

    <title>Sail</title>
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <#include "header.ftl">
        <#include "sidebar.ftl">
        <div class="layui-body">
            <div style="padding: 15px;">
    </#macro>

    <#macro footer>
            </div>
        </div>
        <#include "footer.ftl">
    </div>
</body>
<script src="/plugins/jquery/jquery.min.js"></>
<script src="/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="/plugins/sweetalert2/sweetalert2.js"></script>
<script src="/plugins/simplemde/simplemde.min.js"></script>
<script src="/plugins/layui/layui.js"></script>
<script src="/js/app.js"></script>

<#nested />
</html>
</#macro>