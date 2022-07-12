def testFunc():

    pip install PyMySQL

    connect = pymysql.connect(host='43.200.48.164', user='root', password='1234', db='projectdb', charset='utf8mb4')
    cur = connect.cursor()


    query = "SELECT * FROM product limit 5"
    cur.execute(query)
    connect.commit()


    datas = cur.fetchall()
    for data in datas:
        print(data)