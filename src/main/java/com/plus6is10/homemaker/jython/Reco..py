pip install pymysql

import pymysql

db = pymysql.connect(host='43.200.48.164', port=3306, user='root', passwd='1234', db='projectdb', charset='utf8')

# print(db)