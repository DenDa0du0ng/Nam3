import dns.resolver

#Tạo một đối tượng Resolver để đại diện cho bộ giải quyết DNS.
my_resolver = dns.resolver.Resolver()

hosts = ["google.com", "facebook.com"]
#Với mỗi tên miền trong danh sách hosts, đoạn code in ra tên miền đó và tiến hành giải quyết tên miền bằng cách sử dụng phương thức resolve() của đối tượng Resolver.
for host in hosts:
    print(host)
    ip = my_resolver.resolve(host, "A")
    # in ra địa chỉ IP của tên miền đó.
    for i in ip:
        print(i)