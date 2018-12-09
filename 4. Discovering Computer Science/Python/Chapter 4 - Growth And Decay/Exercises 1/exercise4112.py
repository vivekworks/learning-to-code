"""
Purpose : Print diamond shaped stars
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def diamond():
        """
        Description:
              Print diamond
        Parameters:
              None
        Return value:
              None
        """
        one =''
        two = ''
        for firsthalf in range(5,0,-1):
          print('{0:*>5} {1:*<5}'.format(one, two))
          one=one+' '
          two=two+' '
        one =' '
        two = ' '
        for secondhalf in range(1,6):
          print(secondhalf*'*'+(6-secondhalf-1)*one+' '+(6-secondhalf-1)*one+secondhalf*'*')
          #print(('{0:*>'+str(secondhalf)+'} {1: >'+str(secondhalf)+'}').format('',''))        

def main():
        """
        Description:
              Print diamond
        Parameters:
              None
        Return value:
              None
        """
        diamond()

main() #Main Function Call
