import socket

HOST = '127.0.1.2'
PORT = 65432

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.bind((HOST, PORT))
    s.listen()
    conn, addr = s.accept()
    print('Connected by', addr)
    with conn:
        while True:
            data = conn.recv(1024)
            if not data:
                break
            conn.sendall(data)
          
