# EasyPermissionsGo
a easypermissions extends with a custiomized dialog   
原始的EasyPermissions自带对话框, 但是对话框样式很普通, 很有可能跟我们平时项目所用的统一风格的对话框不一致.   
本项目让用户使用easypermissions时能够使用自己的对话框, 不用其默认提供的对话框.   
#用法   
1. 使用自定义对话框, 实现PermissionWithDialogCallbacks接口   
1. 使用easypermissions自带对话框, 实现PermissionCallbacks接口   
1. 根据int dialogType来判断对话框的种类, 比如"1"代表只有一个确定按钮的对话框, "2"代表有确定和取消按钮的对话框, 这些由用户自己定义.   
#TODO   
增加easypermission自带的对话框
