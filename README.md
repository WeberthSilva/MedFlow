# MedFlow

**Autor:** Weberth Silva de Souza

## Sobre o Projeto

O **MedFlow** é um sistema de gerenciamento hospitalar desenvolvido em Java com foco no controle de pacientes, médicos, medicamentos e prescrições.

O sistema simula o fluxo de atendimento de uma unidade de saúde, permitindo que administradores gerenciem médicos e que profissionais da área médica acompanhem pacientes, registrem prescrições e controlem horários de medicamentos através de alarmes.

O projeto foi desenvolvido utilizando conceitos de Programação Orientada a Objetos, organização em camadas e manipulação de arquivos para persistência de dados.

---

# Funcionalidades Implementadas

## Sistema de Login

O sistema possui autenticação de usuários com diferentes níveis de acesso.

Funcionalidades:

- Login por email e senha
- Controle de acesso por tipo de usuário
- Separação entre administrador e médico

Classes relacionadas:
SistemaLogin
Autenticador
Usuario


---

# Módulo Administrativo

O administrador possui controle dos profissionais cadastrados.

Funcionalidades:

- Cadastro de médicos
- Listagem de médicos
- Gerenciamento dos usuários médicos

O administrador possui acesso ao:
MenuAdmin


---

# Gerenciamento Médico

Cada médico possui seu próprio ambiente dentro do sistema.

Funcionalidades:

- Cadastro de pacientes
- Listagem de pacientes
- Seleção de paciente
- Criação de prescrições

Classe principal:  
MenuMedico

---

# Cadastro de Pacientes

O sistema permite registrar informações clínicas básicas:

Dados cadastrados:

- Nome
- Idade
- Histórico

Cada paciente fica associado ao médico responsável.

Exemplo
Paciente
|
+-- Médico responsável

---

# Módulo de Prescrição

O médico pode criar prescrições contendo:

- Medicamento
- Dosagem
- Horário
- Frequência

Exemplo:
Medicamento: Dipirona
Dosagem: 500mg
Horário: 08:00
Frequência: Diário


Classes:
Prescricao
Medicamento


---

# Sistema de Alarmes

O MedFlow possui um sistema de alerta de horários de medicamentos.

Funcionamento:

- A prescrição cria um alarme
- O sistema verifica o horário atual
- Quando chega o momento correto, exibe um aviso
- O médico pode confirmar o medicamento

Classe responsável:


AlarmeService


Exemplo:

==================================
     HORA DO MEDICAMENTO
    Medicamento: Dipirona
        Horário: 08:00
==================================
---

# Persistência de Dados

O projeto possui armazenamento utilizando arquivos de texto.

Arquivos utilizados:

dados/
medicos.txt
usuarios.txt
pacientes.txt
prescricoes.txt


A classe responsável:
ArquivoService


Permite:
- Salvar informações
- Ler dados salvos
- Recuperar registros ao iniciar o sistema

---

# Estrutura do Projeto
MedFlow

src

├── controller
│ ├── LoginController.java
│ ├── MenuAdmin.java
│ └── MenuMedico.java
│
├── model
│ ├── Usuario.java
│ ├── Admin.java
│ ├── Medico.java
│ ├── Paciente.java
│ ├── Medicamento.java
│ ├── Prescricao.java
│ └── Alarme.java
│
└── service
├── ArquivoService.java
├── AlarmeService.java
│
└── login
├── SistemaLogin.java
└── Autenticador.java
│
│
└──Main



---

# Conceitos Aplicados
## Programação Orientada a Objetos
O projeto utiliza:

### Herança
Exemplo:
Usuario
|
+-- Admin
|
+-- Medico


---

### Encapsulamento

Atributos privados com acesso através de métodos.

Exemplo:

```java
private String email;

public String getEmail(){
    return email;
}
Associação entre Classes

Relacionamentos:

Médico
 |
 +-- Pacientes
        |
        +-- Prescrições
                |
                +-- Medicamentos
Tecnologias Utilizadas

Linguagem:

Java SE

Entrada de dados:

Scanner

Estrutura de dados:

ArrayList
List

Manipulação de arquivos:

Java IO

Controle de versão:

Git / GitHub
Melhorias Futuras

Possíveis evoluções:

Implementação de banco de dados PostgreSQL/MySQL
Interface gráfica usando JavaFX
Criação de API REST
Sistema de pacientes com login próprio
Histórico completo de consultas
Relatórios médicos
Criptografia de senhas
Testes automatizados
Objetivo Acadêmico

Diagramas:
Diagramas de classe
<img width="332" height="187" alt="image" src="https://github.com/user-attachments/assets/6f8fe433-ca20-488f-9ae6-bfdd1fab4d57" />
Caso de uso
<img width="250" height="181" alt="image" src="https://github.com/user-attachments/assets/37a561c4-c92b-4d18-92e8-5f9aea00d25b" />
Diagrama de atividade
<img width="307" height="243" alt="image" src="https://github.com/user-attachments/assets/7cd712ba-4b0a-4fed-814d-ba4ecfb3e114" />




Este projeto tem como objetivo praticar desenvolvimento backend em Java, aplicando conceitos fundamentais de engenharia de software, orientação a objetos, organização de código e criação de sistemas reais.

O MedFlow representa a evolução do aprendizado em desenvolvimento de sistemas utilizando boas práticas de programação.


Esse README fica mais alinhado com o estado atual do seu repositório e valoriza as partes que você realment
