# 🛒 Sistema de E-commerce em Java

## 📌 Descrição

Este projeto consiste na modelagem de um sistema simples de **E-commerce**, utilizando conceitos de **Programação Orientada a Objetos (POO)**.

O sistema simula o fluxo básico de um pedido, onde:
- Um **Cliente** realiza um pedido
- O **Pedido** contém uma lista de itens
- Cada item é representado por um **ItemPedido**

---

## 🧠 Conceitos Aplicados

- Relacionamento entre classes (Associação)
- Encapsulamento
- Listas (`List`)
- Organização de responsabilidades
- Regras de negócio

---

## 🏗️ Estrutura do Projeto

### 🔹 Classe `Cliente`

Representa o cliente do sistema.

**Atributos:**
- `nome`
- `email`

---

### 🔹 Classe `ItemPedido`

Representa um item dentro de um pedido.

**Atributos:**
- `nomeProduto`
- `quantidade`
- `precoUnitario`

---

### 🔹 Classe `Pedido`

Representa um pedido realizado por um cliente.

**Atributos:**
- `cliente` (Cliente)
- `itens` (Lista de ItemPedido)

**Responsabilidades:**
- Armazenar os itens do pedido
- Calcular o valor total
- Aplicar regras de frete
- Exibir recibo

---

## ⚙️ Funcionalidades

- Criar cliente  
- Adicionar itens ao pedido  
- Calcular valor total  
- Aplicar regra de frete  
- Exibir recibo detalhado  

---

## 🚨 Regra de Negócio

### 📦 Cálculo de Frete

Ao finalizar o pedido através do método:

```java
fecharPedido()
```

A seguinte regra deve ser aplicada:

- Se o valor total dos itens for **maior que R$250,00**:
  ```txt
  Frete grátis
  ```

- Caso contrário:
  ```txt
  Frete: R$25,00
  ```

---

## 🧾 Recibo

O sistema deve imprimir um recibo contendo:

- Dados do cliente  
- Lista de itens  
- Valor total dos produtos  
- Valor do frete  
- Valor final do pedido  

---

## 💻 Exemplo de Uso

```java
Cliente cliente = new Cliente("Gabriel", "gabriel@email.com");

Pedido pedido = new Pedido(cliente);

pedido.adicionarItem(new ItemPedido("Mouse", 2, 50.0));
pedido.adicionarItem(new ItemPedido("Teclado", 1, 150.0));

pedido.fecharPedido();
```

---

## 🎯 Objetivo Acadêmico

Este exercício tem como objetivo reforçar:

- Modelagem de sistemas com múltiplas classes  
- Relacionamento entre objetos  
- Encapsulamento  
- Aplicação de regras de negócio  
- Organização de código em Java  

---

## 📚 Tecnologias Utilizadas

- Java  

---

## 👨‍💻 Autor

**Gabriel Carneiro Botelho**  
Estudante de Análise e Desenvolvimento de Sistemas  
