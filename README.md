# SSM_Design

## 接口列表
### 1.登录模块
#### 1.1用户登录
接口名：undefined  
接口说明：用于用户登录系统，根据登录类型返回不同的用户ID  
参数列表

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| name | String | 登录名 |
| passWord | String | 登录密码 |
| loginType | Integer | 登录密码 | 0-领导；<br>1-管理员；<br>2-教师；<br>3-学生

返回参数

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 接口是否请求成功 |
| id | Integer | 用户ID | 可选
| teacherId | Integer | 教师ID | 可选
| studentId | Integer | 学生ID | 可选

### 1.毕业设计模块
#### 1.1分页获取所有毕业设计
接口名：undefined  
接口说明：分页获取所有毕业设计  
参数列表

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| curr | Integer | 页码数 |
| limit | Integer | 每页显示数 |

返回参数

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 接口是否请求成功 |
| count | Integer | 获取数据数量 | 
| total | Integer | 数据总数 | 
| list | List | 毕业设计信息 | 