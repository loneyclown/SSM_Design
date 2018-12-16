# SSM_Design

## 接口列表
### 登录模块
#### 1.用户登录
1.1 接口说明：用于用户登录系统  
1.2 参数列表

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| name | String | 登录名 |
| passWord | String | 登录密码 |
| loginType | int | 登录密码 | 0-领导；<br>1-管理员；<br>2-教师；<br>3-学生