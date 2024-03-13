import socket
import requests

hostname = socket.gethostname() # 拿到主機名稱
print(hostname)
ip = socket.gethostbyname(hostname) # 利用主機名稱拿到對應私有IP
print(ip)

# 取得對外連線的NAT公有IP
p_ip = requests.get('https://api.ipify.org/').text
print(p_ip)