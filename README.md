# 🧴 Simulação de Garrafa de Água em Java

Este projeto simula uma garrafa de água, permitindo ao usuário *beber, **encher* e visualizar o *status* da garrafa pelo terminal. Uma abordagem prática para aprender e praticar conceitos de orientação a objetos em Java!

---

## 🚀 Funcionalidades

- *Beber água:* Retira uma quantidade (ml) da garrafa.
- *Encher:* Adiciona água à garrafa, respeitando a capacidade máxima.
- *Status:* Mostra a quantidade de água restante na garrafa.
- *Validações:*  
  - Não permite beber mais água do que a disponível.
  - Não permite encher além do limite da garrafa (500ml).
  - Não aceita valores negativos para beber ou encher.

---

## 📦 Estrutura do Projeto
Garrafa/
├── GarrafaDeAgua.java
└── Objeto.java


---

## 💻 Como rodar o projeto

1. *Clone este repositório:*
   bash
   git clone https://github.com/BernardoBorbaR/AprendizadoClasse.git
   cd AprendizadoClasse/Garrafa
Compile os arquivos Java:

javac GarrafaDeAgua.java Objeto.java
Execute o programa:

java Objeto
📝 Exemplo de uso
Escolha: 
 1- Beber
 2- Encher
 3- Status
 4- Parar

> 1
Quanto você quer beber: 
> 100
Quantidade: 400ml

> 2
Quanto você quer encher: 
> 200
Quantidade: 500ml

> 1
Quanto você quer beber: 
> 600
Não é possível, pois não tem quantidade o suficiente!!
A quantidade que faltou é: 100
Quantidade: 0ml
🛠 Conceitos abordados
Programação orientada a objetos (POO)
Métodos com retorno e parâmetros
Estruturas de repetição e controle
Entrada de dados via terminal (Scanner)
Validação de dados do usuário
🤝 Contribua
Encontrou um bug ou quer sugerir melhorias? Sinta-se à vontade para abrir issues ou enviar pull requests!

<p align="center"> <i>Desenvolvido por <a href="https://github.com/BernardoBorbaR">Bernardo Borba</a></i> </p> 
