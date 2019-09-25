Start server
```
./gradlew run
```
Run
```
curl localhost:8080/test
```
which shows a html that belongs to google com

Now get the ip address for bing, eg 
```
ping www.bing.com
```
and update your hosts file to point www.google.com to bing
```
vi /etc/hosts
```
eg
```
204.79.197.200 www.google.com
```
Now rerun after the dns cache times out (approx 60 seconds)
```
curl localhost:8080/test
```
and u see that there is still results from www.google.com that is returned.
However, if client pooling is disabled, a new dns lookup is made after the dns ttl, and different content is returned.