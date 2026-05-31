#  MedFlow

**Autor:** Weberth Silva de Souza

---

##  Sobre o Projeto

O **MedFlow** é um sistema desenvolvido para auxiliar profissionais de saúde no controle e na administração de pacientes e medicamentos em ambiente hospitalar. A aplicação permite gerenciar prescrições, registrar horários e dosagens, além de acompanhar todo o histórico de medicação dos pacientes diretamente pelo terminal.

---

##  Funcionalidades Implementadas

* **Módulo de Autenticação:** Sistema de login funcional para controle de acesso através da classe `Autenticador`.
* **Gerenciamento de Múltiplos Médicos:** O `Admin` possui controle centralizado para cadastrar e listar vários profissionais.
* **Cadastro de Pacientes:** Registro de ficha clínica contendo Nome, Idade e Histórico.
* **Vínculo Clínico:** Associação direta de pacientes ao seu respectivo médico responsável.
* **Módulo de Prescrição:** Cadastro completo de medicamentos e emissão de receitas detalhadas (com dosagem, horários e frequência de uso).
* **Menu Interativo:** Navegação dinâmica via console (`Scanner`) para gerenciamento das operações em tempo real.

---

##  Objetivo

Este projeto foi desenvolvido com a finalidade de praticar, consolidar e demonstrar o domínio dos seguintes conceitos:

* **Programação Orientada a Objetos (POO):** Uso prático de pilares como **Herança** (classe base `Usuario` estendida por `Medico` e `Admin`) e **Encapsulamento** (atributos privados e métodos acessores).
* **Estruturas de Dados:** Manipulação avançada de listas dinâmicas em memória utilizando `ArrayList` e `List`.
* **Arquitetura de Software:** Organização estruturada e divisão clara de responsabilidades entre classes de modelo (`model`), serviços (`service`) e controle de fluxo (`controller`).

---

##  Como o Sistema Funciona

A lógica do sistema está estruturada da seguinte forma:

1. **Autenticação:** O sistema exige credenciais válidas para liberar o painel principal.
2. **Nível Administrativo:** Um Administrador (`Admin`) realiza o gerenciamento e a listagem dos médicos do hospital.
3. **Nível Médico:** O médico selecionado pode cadastrar seus próprios pacientes, gerando um vínculo de atendimento único.
4. **Tratamento e Histórico:** Dentro do perfil de cada paciente, o médico pode prescrever medicamentos específicos detalhando a posologia.
5. **Persistência:** Os dados são armazenados temporariamente em memória, simulando com precisão o fluxo de um banco de dados real.

---

##  Tecnologias Utilizadas

* **Linguagem:** Java (Java SE)
* **Entrada de Dados:** `java.util.Scanner`
* **Coleções:** `java.util.List` e `java.util.ArrayList`

---

##  Melhorias Futuras

O projeto está em constante evolução e os próximos passos planejados incluem:

* [ ] Integração com banco de dados relacional (PostgreSQL) para persistência permanente dos dados.
* [ ] Implementação de uma Interface Gráfica de Usuário (GUI) ou desenvolvimento de uma API REST.
* [ ] Criação de testes unitários para validação dos fluxos de regras de negócio.

---

##  Observação

Este projeto possui caráter estritamente educacional, fazendo parte do meu processo de aprendizado, evolução prática e consolidação de conceitos essenciais no desenvolvimento de software backend.
