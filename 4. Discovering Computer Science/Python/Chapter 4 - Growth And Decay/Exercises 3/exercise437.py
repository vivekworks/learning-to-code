"""
Purpose : Vampire Apocalypse
Author  : Vivek T S
Date    : 02/11/2018
"""
def vampireApocalypse(v, k, vampires, people):
    day = 0
    while people > vampires:
        vampires = (vampires*(v+1)) - k
        day = day+1
    return day

def main():
    v = int(input('Converting Vampires : '))
    k = int(input('Killing Vampires : '))
    vampires = int(input('Initial Vampires : '))
    people = int(input('World Population : '))
    print(vampireApocalypse(v, k, vampires, people))

main()
