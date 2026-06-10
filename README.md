[DIAGRAMA (2).drawio](https://github.com/user-attachments/files/28815741/DIAGRAMA.2.drawio)# MedFlow

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

     HORA DO MEDICAMENTO
    Medicamento: Dipirona
        Horário: 08:00

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

<img width="162" height="417" alt="image" src="https://github.com/user-attachments/assets/4446cfa1-740a-4ce9-b1bb-2c753237b862" />



---

# Conceitos Aplicados
## Programação Orientada a Objetos
O projeto utiliza:

### Herança
Exemplo:

<img width="62" height="78" alt="image" src="https://github.com/user-attachments/assets/993a5143-3864-4a94-9304-af8905df60f5" />

Usuario
|
+--- Admin
|
+--- Medico
### Encapsulamento

Atributos privados com acesso através de métodos.

Exemplo:

java
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

<img width="332" height="187" alt="image" src="https://github.com/user-attachments/assets/6f8fe433-ca20-488f-9ae6-bfdd1fab4d57" />

<img width="250" height="181" alt="image" src="https://github.com/user-attachments/assets/37a561c4-c92b-4d18-92e8-5f9aea00d25b" />

<[Uploading DI<mxfile host="app.diagrams.net">
  <diagram name="Página-1" id="kCsqjUG8PVlwAB1OgnFi">
    <mxGraphModel dx="1253" dy="703" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="raia_medico" parent="1" style="swimlane;horizontal=false;startSize=0;html=1;whiteSpace=wrap;fontStyle=1" value="MÉDICO" vertex="1">
          <mxGeometry height="160" width="760" x="40" y="40" as="geometry" />
        </mxCell>
        <mxCell id="raia_sistema" parent="1" style="swimlane;horizontal=false;startSize=0;html=1;whiteSpace=wrap;fontStyle=1" value="SISTEMA (MedFlow)" vertex="1">
          <mxGeometry height="220" width="760" x="40" y="200" as="geometry" />
        </mxCell>
        <mxCell id="fim" parent="raia_sistema" style="ellipse;html=1;shape=endState;fillColor=#000000;strokeColor=#000000;" value="" vertex="1">
          <mxGeometry height="30" width="30" x="130" y="40" as="geometry" />
        </mxCell>
        <mxCell id="act_historico" parent="raia_sistema" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Atualizar Histórico e&#xa;Prontuário do Paciente" vertex="1">
          <mxGeometry height="50" width="160" x="65" y="110" as="geometry" />
        </mxCell>
        <mxCell id="edge_fim" edge="1" parent="raia_sistema" source="act_historico" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="fim">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="inicio" parent="1" style="ellipse;html=1;fillColor=#000000;strokeColor=none;" value="" vertex="1">
          <mxGeometry height="30" width="30" x="100" y="105" as="geometry" />
        </mxCell>
        <mxCell id="act_prescrever" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Selecionar Paciente e&#xa;Definir Medicação/Dose" vertex="1">
          <mxGeometry height="60" width="160" x="180" y="90" as="geometry" />
        </mxCell>
        <mxCell id="act_salvar" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Gravar e Liberar&#xa;Prescrição" vertex="1">
          <mxGeometry height="60" width="130" x="390" y="90" as="geometry" />
        </mxCell>
        <mxCell id="act_calcular" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Processar Prescrição e&#xa;Calcular Grade de Horários" vertex="1">
          <mxGeometry height="50" width="160" x="375" y="230" as="geometry" />
        </mxCell>
        <mxCell id="act_alerta" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Emitir Alerta Visual/Sonoro&#xa;(Horário Próximo)" vertex="1">
          <mxGeometry height="50" width="160" x="375" y="320" as="geometry" />
        </mxCell>
        <mxCell id="act_ver_alerta" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Visualizar Alerta no&#xa;Painel de Monitoramento" vertex="1">
          <mxGeometry height="50" width="160" x="375" y="450" as="geometry" />
        </mxCell>
        <mxCell id="decisao_apto" parent="1" style="rhombus;whiteSpace=wrap;html=1;" value="Paciente apto e&#xa;aceitou a dose?" vertex="1">
          <mxGeometry height="60" width="130" x="390" y="530" as="geometry" />
        </mxCell>
        <mxCell id="act_aplicar" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Administrar Medicamento&#xa;à Beira do Leito" vertex="1">
          <mxGeometry height="50" width="160" x="580" y="535" as="geometry" />
        </mxCell>
        <mxCell id="edge1" edge="1" parent="1" source="inicio" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="act_prescrever">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge2" edge="1" parent="1" source="act_prescrever" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="act_salvar">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge3" edge="1" parent="1" source="act_salvar" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="act_calcular">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge4" edge="1" parent="1" source="act_calcular" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="act_alerta">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge5" edge="1" parent="1" source="act_alerta" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="act_ver_alerta">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge6" edge="1" parent="1" source="act_ver_alerta" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="decisao_apto">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge_sim" edge="1" parent="1" source="decisao_apto" style="edgeStyle=orthogonalEdgeStyle;html=1;labelBackgroundColor=#FFFFFF;" target="act_aplicar">
          <mxGeometry relative="1" value="Sim" as="geometry">
            <mxPoint x="530" y="560" as="sourcePoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="edge_nao" edge="1" parent="1" source="decisao_apto" style="edgeStyle=orthogonalEdgeStyle;html=1;labelBackgroundColor=#FFFFFF;" target="act_recusa">
          <mxGeometry relative="1" value="Não" as="geometry">
            <mxPoint x="390" y="560" as="sourcePoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="edge_vinda_recusa" edge="1" parent="1" source="act_recusa" style="edgeStyle=orthogonalEdgeStyle;html=1;" target="act_historico">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="edge_vinda_aplicar" edge="1" parent="1" source="act_recusa" style="edgeStyle=orthogonalEdgeStyle;html=1;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" target="act_historico">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="raia_enfermeiro" parent="1" style="swimlane;horizontal=false;startSize=0;html=1;whiteSpace=wrap;fontStyle=1" value="ENFERMEIRO" vertex="1">
          <mxGeometry height="260" width="760" x="40" y="420" as="geometry" />
        </mxCell>
        <mxCell id="_T9hJ9YQBRnz9Wywalr8-7" edge="1" parent="1" source="act_aplicar" style="edgeStyle=orthogonalEdgeStyle;html=1;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" target="act_recusa" value="">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="580" y="560" as="sourcePoint" />
            <mxPoint x="185" y="360" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="act_recusa" parent="1" style="html=1;whiteSpace=wrap;rounded=1;arcSize=12;" value="Registrar Justificativa&#xa;de Não Aplicação" vertex="1">
          <mxGeometry height="50" width="150" x="110" y="540" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
AGRAMA (2).drawio…]()




Este projeto tem como objetivo praticar desenvolvimento backend em Java, aplicando conceitos fundamentais de engenharia de software, orientação a objetos, organização de código e criação de sistemas reais.

O MedFlow representa a evolução do aprendizado em desenvolvimento de sistemas utilizando boas práticas de programação.


Esse README fica mais alinhado com o estado atual do seu repositório e valoriza as partes que você realment
