### Configuracao banco de dados

1. Após subir o docker compose do mysql, acesse o terminal interno do container do mysql e execute os comandos abaixo

```
mysql -u root -p
```
```
update mysql.user set host='%' where user='root';
```
```
FLUSH PRIVILEGES;
```
Agora você pode sair do terminal do mysql e subir a aplicação que ela se conectará ao banco de dados.