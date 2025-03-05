# 柒图图智能协同云图库
## 项目简介
基于 Spring Boot + Redis + COS +Al+ WebSocket 的图库平台。
分为公共图库、私有图库和团队共享图库三大模块。
用户可在平台公开上传和检索图片;
管理员可以上传、审核和管理分析图片。
个人用户可将图片上传至私有空间进行批量管理、多维检索、编辑和分析;
个人用户还可开通团队空间并邀请其他成员，共享和实时协同编辑图片。

## 技术选型
### 后端
#### -Java Spring Boot 框架
#### -MySQL 数据库+MyBatis-Plus 框架+ MyBatis X
#### -Redis 分布式缓存 +Caffeine 本地缓存
#### -Jsoup 数据抓取
#### -COS 对象存储
#### -ShardingSphere 分库分表
#### -Sa-Token 权限控制
#### -WebSocket 双向通信
#### -Disruptor 高性能无锁队列
#### -JUC 并发和异步编程
#### -AI绘图大模型接入
#### -多种设计模式的运用
#### -多角度项目优化:性能、成本、安全性等

##项目架构
![1741163841195](https://github.com/user-attachments/assets/b9e2ca0f-f008-4a88-98d7-357f61292942)

