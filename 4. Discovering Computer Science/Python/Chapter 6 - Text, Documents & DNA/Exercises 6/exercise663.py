"""
Purpose - Measure the Hamming Distance
Author  - Vivek T S
Date    - 15/12/2018
"""
def hamming(bits1, bits2):
        distance=0
        for index in range(len(bits1)):
                if bits1[index] != bits2[index]:
                        distance+=1
        return distance

def main():
        print(hamming('1010101010101010','1010101010101010'))

main()
