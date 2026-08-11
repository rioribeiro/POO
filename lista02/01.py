def main():
    print("Digite 4 números inteiros (separados por espaço):")
    nums = []
    while len(nums) < 4:
        try:
            nums += list(map(int, input().split()))
        except EOFError:
            break
    nums = nums[:4]
    soma_pares = sum(n for n in nums if n % 2 == 0)
    soma_impares = sum(n for n in nums if n % 2 != 0)
    print("Soma dos pares:", soma_pares)
    print("Soma dos ímpares:", soma_impares)

if __name__ == "__main__":
    main()