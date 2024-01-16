A very simple Command Line tool for sending WakeOnLan packets.
Original Code for sending the packet: https://gist.github.com/jumar/9200840

Usage: 

Jar (requires Java Runtime): java -jar WakeOnLan.jar mac-address ip (optional, if no ip is passed in, 255.255.255.255 is used.)

Exe (Windows): .\WakeOnLan.exe mac-address ip (optional, if no ip is passed in, 255.255.255.255 is used.)

Linux Executable: ./WakeOnLan  mac-address ip (optional, if no ip is passed in, 255.255.255.255 is used.)

Example without IP: ./WakeOnLan 00:1b:63:84:45:e6
Example with IP: ./WakeOnLan 00:1b:63:84:45:e6 192.168.8.185

In most cases, the IP is not required.
