#  DDD Pacemaker

You can find the NIOS project files in the /Assignment folder.

We are using the pre-build cs303.sof also located in the /Assignment folder.

## Modes
1. UART
    - Switch 0 [SW0] in the down position
2. Buttons
    - Switch 0 [SW0] in the up position

## Implementations
1. SCCharts
    - Switch 1 [SW1] in the up position
2. Pure C
    - Switch 1 [SW1] in the down position
---
### Button Mode
In button mode the pacemaker does not respond to UART messages, it instead uses two key buttons on the FPGA DE2-115 board.
- VS,  Key 0 [KEY0]
- AS,  Key 1 [KEY1]


### UART Mode
In UART mode the pacemaker respondes to two UART message characters, V and A:
```c
switch (uartBuffer[i]){
    case 'V':
        VSBuffer = 1;
        break;
    case 'A':
        ASBuffer = 1;
        break;
}
```
It will also transmit messages across UART when VP and AP are triggered, V and A accordingly.

--- 
## Indicator Lights
There are two indicator lights on the FPGA, these are used for VP and AP. LEDG0 is VP and LEDG1 is AP.
