####  安装 hexo 

~~~bash
sudo choco install nodejs --version=10.23.0
# 先安装nodejs  指定版本10.23.0
npm install -g hexo-cli
#全局安装hexo-cli

~~~

 

数据表设计：

用户表：

| [ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [ACCOUNT_ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [NAME ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TOKEN ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_CREATE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_MODIFIED ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [BIO ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [AVATAR_URL ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| 1                                                            | 13062249                                                     | 李永东                                                       | 25b4d057-0a4a-4006-9f0d-5ca9a5fb261a                         | 1618673054556                                                | 1618673270555                                                | *null*                                                       | https://avatars.githubusercontent.com/u/13062249?v=4         |



问题表设计：

| [ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TITLE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [DESCRIPTION ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_CREATE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_MODIFIED ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [CREATOR ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [COMMENT_COUNT ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [VIEW_COUNT ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [LIKE_COUNT ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TAG ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
|                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |



表设计：

| [ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [NOTIFIER ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [RECEIVER ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [OUTERID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TYPE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_CREATE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [STATUS ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [NOTIFIER_NAME ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [OUTER_TITLE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
|                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |



表设计： 

| [ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TITLE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [URL ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [PRIORITY ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_CREATE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_MODIFIED ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [STATUS ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
|                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |

表设计：

| [ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [PARENT_ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TYPE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [COMMENTATOR ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_CREATE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_MODIFIED ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [LIKE_COUNT ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [CONTENT ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [COMMENT_COUNT ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
|                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |

网站广告表设计：

| [ID ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [TITLE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [URL ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [IMAGE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_START ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_END ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_CREATE ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [GMT_MODIFIED ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [STATUS ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) | [POS ](http://10.0.54.2:8082/query.do?jsessionid=70d293eed0815adb24985141599ca178#) |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
|                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |                                                              |
