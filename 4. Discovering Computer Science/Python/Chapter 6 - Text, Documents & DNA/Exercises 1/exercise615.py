"""
Purpose : Replacing pop culture short references
Author  : Vivek T S
Date    : 22/11/2018
"""
def txtHelp(txt):
        return txt.replace(' u ',' you ').replace('lol','laugh out loud').replace('brb','be right back').replace('imo','in my opinion').replace(' r ',' are ')

def main():
        print(txtHelp(input('Text : ')))

main()
