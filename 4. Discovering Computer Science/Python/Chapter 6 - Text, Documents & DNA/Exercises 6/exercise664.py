"""
Purpose - Measure the Hamming Distance
Author  - Vivek T S
Date    - 15/12/2018
"""
def hamming(bits1, bits2):
        distance=0
        if len(bits1)>len(bits2):
                length=len(bits1)
        else:
                length=len(bits2)
        for index in range(length):
                if index<len(bits1) and index<len(bits2) and bits1[index] != bits2[index]:
                    distance+=1
                elif (index>=len(bits1) and index<len(bits2)) or (index>=len(bits2) and index<len(bits1)):
                        distance+=1
        return distance

def main():
        print(hamming('101010101010','110101010'))

main()
