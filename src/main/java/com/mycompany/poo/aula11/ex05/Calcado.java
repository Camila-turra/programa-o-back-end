package com.mycompany.poo.aula11.ex05;

public class Calcado {
    
    class Time:
    def __init__(self, nome, abreviacao, torcida, estado, cidade):
        self.nome = nome
        self.abreviacao = abreviacao
        self.torcida = torcida
        self.estado = estado
        self.cidade = cidade

# Exemplo de uso da classe Time
time1 = Time("Atlético Mineiro", "CAM", 1000000, "Minas Gerais", "Belo Horizonte")

print(f"Nome: {time1.nome}")
print(f"Abreviação: {time1.abreviacao}")
print(f"Torcida: {time1.torcida}")
print(f"Estado: {time1.estado}")
print(f"Cidade: {time1.cidade}")
}
