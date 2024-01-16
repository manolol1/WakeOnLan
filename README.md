# Command Line tool for sending WakeOnLan packets.

### Original Code for sending the packet: https://gist.github.com/jumar/9200840

<br/>

## Usage: 

**Jar (requires JRE):** `java -jar WakeOnLan.jar mac-address ip`

**Linux Executable:** `./WakeOnLan  mac-address ip`

**Exe (Windows):** `.\WakeOnLan.exe mac-address ip`

<br/>

Specifying an IP-Address is not required. By default, 255.255.255.255 is used.

<br/>

Example without IP: `./WakeOnLan 00:1b:63:84:45:e6`

Example with IP: `./WakeOnLan 00:1b:63:84:45:e6 192.168.8.185`

<br/>

Note: On Linux, you might need to add executing permissions to the file. Usually, you can do that with `sudo chmod 777 WakeOnLan`

File names might be slightly different.
