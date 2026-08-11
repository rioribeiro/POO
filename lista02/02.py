mes = int(input("Digite o número do mês (1-12): "))

# Mapeando o nome do mês
match mes:
    case 1: nome = "Janeiro"
    case 2: nome = "Fevereiro"
    case 3: nome = "Março"
    case 4: nome = "Abril"
    case 5: nome = "Maio"
    case 6: nome = "Junho"
    case 7: nome = "Julho"
    case 8: nome = "Agosto"
    case 9: nome = "Setembro"
    case 10: nome = "Outubro"
    case 11: nome = "Novembro"
    case 12: nome = "Dezembro"
    case _: nome = None

# Mapeando o trimestre usando padrões agrupados
match mes:
    case 1 | 2 | 3: trimestre = "1º Trimestre"
    case 4 | 5 | 6: trimestre = "2º Trimestre"
    case 7 | 8 | 9: trimestre = "3º Trimestre"
    case 10 | 11 | 12: trimestre = "4º Trimestre"
    case _: trimestre = None

if nome and trimestre:
    print(f"{nome} - {trimestre}")
else:
    print("Mês inválido!")
