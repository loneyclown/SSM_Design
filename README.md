# SSM_Design

## 接口列表
### 1.登录模块
#### 1.1用户登录
接口名：undefined  
接口说明：用于用户登录系统，根据登录类型返回不同的用户ID  
参数列表：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| name | String | 登录名 |
| passWord | String | 登录密码 |
| loginType | Integer | 登录密码 | 0-领导<br>1-管理员<br>2-教师<br>3-学生

返回参数：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 操作是否成功 |
| id | Integer | 用户ID | 可选
| teacherId | Integer | 教师ID | 可选
| studentId | Integer | 学生ID | 可选

### 1.毕业设计模块
#### 1.1分页获取所有毕业设计课题
接口名：undefined  
接口说明：分页获取所有毕业设计课题
参数列表：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| curr | Integer | 页码数 |
| limit | Integer | 每页显示数 |

返回参数：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 操作是否成功 |
| count | Integer | 获取数据数量 | 
| total | Integer | 数据总数 | 
| list | List | 毕业设计信息 | 

#### 1.2根据ID获取毕业设计课题信息
接口名：undefined  
接口说明：根据ID获取毕业设计课题信息
参数列表：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| id | Integer | 毕业设计课题ID |

返回参数：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 操作是否成功 |
| data | Entity | 毕业设计课题信息 | 

#### 1.3根据ID删除毕业设计课题
接口名：undefined  
接口说明：根据ID删除毕业设计课题
参数列表：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| id | Integer | 毕业设计课题ID |

返回参数：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 操作是否成功 |

#### 1.4根据ID修改毕业设计课题
接口名：undefined  
接口说明：根据ID修改毕业设计课题  
参数列表：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| id | Integer | 毕业设计课题ID |
| topic | String | 毕业设计课题题目 | 可选 |
| description | String | 毕业设计课题描述/要求 | 可选 |
| guideTeacherId | Integer | 课题指导教师ID | 可选 |
| status | Integer | 课题审核状态 | 可选<br>0-未审核<br>1-审核中<br>2-审核通过<br>3-审核未通过 |


返回参数：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 操作是否成功 |

#### 1.4添加毕业设计课题
接口名：undefined  
接口说明：添加毕业设计课题  
参数列表：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| topic | String | 毕业设计课题题目 |
| description | String | 毕业设计课题描述/要求 |
| dishTeacherId | Integer | 课题提出/上报教师ID |

返回参数：

| 参数名 | 参数类型 | 参数说明 | 备注 |
| :------ | :------ | :------ | :------ |
| is | Boolean | 操作是否成功 |