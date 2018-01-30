<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <title>twtiyb</title>
    <!-- 引入 WeUI -->
    <link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/1.1.2/weui.min.css"/>
</head>
<body>

<!-- 使用 -->
<div class="weui-cells">
<#list data as knock>
    <a class="weui-cell weui-cell_access" href="javascript:;">
        <div class="weui-cell__bd">
            <p>${knock.createDate!}</p>
        </div>
        <div class="weui-cell__ft">${knock.knockResult!}</div>
    </a>
</#list>
</div>

</body>
</html>