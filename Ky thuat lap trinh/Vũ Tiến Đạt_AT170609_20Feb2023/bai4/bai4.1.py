import nmap
nmap_path = [r"C:\Program Files (x86)\Nmap\nmap.exe",]
nm = nmap.PortScanner(nmap_search_path=nmap_path)

portList = "21, 22, 23, 25, 80"

#quét các cổng mạng trên trang web facebook.com với danh sách cổng mạng portList.
nm.scan('facebook.com', portList)

#danh sách tất cả các host được quét
print(nm.all_hosts())

# chứa danh sách các host và trạng thái của chúng
hosts_list = [(x, nm[x]['status']['state']) for x in nm.all_hosts()]

#duyệt qua từng host và trạng thái của nó. Với mỗi host, vòng lặp trong cùng được sử dụng để lấy danh sách các protocol và cổng mạng và #trạng thái của chúng được in ra.
for host, status in hosts_list:
    print(host, status)
    for protocol in nm[host].all_protocols():
        print("Protocol: %s" % protocol)
        listport = nm[host]['tcp'].keys()
        for port in listport:
            print("Port: %s State: %s" % (port, nm[host][protocol][port]['state']))