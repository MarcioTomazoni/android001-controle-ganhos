# 🚗 Android001 - Controle de Ganhos

Aplicativo Android desenvolvido para controle financeiro de motoristas parceiros.

## Objetivos

- Registrar abastecimentos
- Calcular lucro líquido
- Gerar relatórios simples

## Tecnologias Utilizadas

- Android Studio
- Kotlin
- Material Design
- Git
- GitHub

---

## Fluxo Atual

```
Dashboard
    ↓
Novo Registro Diário
```

---

## 📁 Estrutura do Projeto

```text
app/
├── models/
│   └── RegistroDiario.kt
│
├── repository/
│   └── RegistroRepository.kt
│
├── navigation/
│   └── AppNavigation.kt
│
├── screens/
│   └── NovoRegistroScreen.kt
│
└── MainActivity.kt
```

---

## 📋 Model Registro Diário

O projeto utiliza um Model para representar os registros diários de trabalho do motorista.

Arquivo:

```
models/
└── RegistroDiario.kt
```

Estrutura:

```kotlin
data class RegistroDiario(
    val data: String,
    val kmRodados: Double,
    val ganhos: Double,
    val combustivel: Double,
    val outrasDespesas: Double,
    val observacao: String
)
```

Responsabilidades:

- Armazenar os dados de um dia de trabalho
- Representar receitas e despesas
- Servir como base para cálculos futuros

---

## 🗄️ Repository

O projeto utiliza um Repository para armazenar temporariamente os registros em memória:

Arquivo:

```
repository/
└── RegistroRepository.kt
```

Estrutura:

```kotlin
object RegistroRepository {
    val registros = mutableListOf<RegistroDiario>()
}
```

Objetivos:

- Simular persistência de dados
- Facilitar testes durante o desenvolvimento
- Preparar a futura integração com o banco de dados local

---

## 🚗 Cadastro de Registro Diário

O aplicativo já possui uma tela funcional para lançamento de informações operacionais do motorista.

Campos atuais:

- Data
- KM Rodados
- Ganhos
- Combustível
- Outras Despesas
- Observação

Observação:
As despesas de combustível e outras despesas serão migradas futuramente para um módulo próprio de despesas, permitindo lançamentos independentes ao longo do dia.

## 🔄 Retorno Automático ao Dashboard

Após salvar um novo registro diário, o aplicativo retorna automaticamente para o Dashboard.

Fluxo:

```text
Dashboard
    ↓
Novo Registro Diário
    ↓
Salvar
    ↓
Retorno Automático
    ↓
Dashboard Atualizado
```

Benefícios:

* Melhor experiência do usuário
* Confirmação visual imediata do lançamento
* Atualização automática dos indicadores financeiros
* Redução de cliques durante o uso diário

---

## 🧪 Testes Realizados

O projeto foi testado com sucesso nos seguintes ambientes:

| Ambiente                    | Status |
|-----------------------------|--------|
| Samsung Galaxy M52          | ✅     |
| Android Emulator Pixel 8    | ✅     |
| Android 16 (Baklava)        | ✅     |

Funcionalidades validadas:

- Inicialização da aplicação
- Navegação entre telas
- Entrada de dados
- Criação de objetos RegistroDiario
- Armazenamento em memória
- Execução em dispositivo físico
- Execução em emulador

---

# 🗺️ Roadmap

## Fase 1 — MVP Local

- [x] Configurar Android Studio
- [x] Criar projeto Kotlin
- [x] Tela Dashboard
- [x] Navegação entre telas
- [x] Cadastro de Registro Diário
- [x] Dashboard dinâmico
- [x] Retorno automático após salvar
- [ ] Cadastro de Despesas
- [ ] Relatório Diário

## Fase 2 — Persistência

- [ ] Banco local Room
- [ ] Histórico de abastecimentos

## Fase 3 — Integração

- [ ] API REST
- [ ] Integração com PHP003
- [ ] Sincronização com MySQL

## Fase 4 — Cloud

- [ ] Deploy backend
- [ ] Backup online
- [ ] Multi-dispositivo

---

# 📚 Objetivos Futuros

- Cálculo de R$/KM
- Listagem de registros diários
- Persistência local com Room Database
- Relatórios mensais
- Gráficos de desempenho
- Exportação de dados
- Backup em nuvem
- Modo escuro
- Publicação na Google Play Store

---

## 🚧 Status Atual

Versão atual: MVP em desenvolvimento

Funcionalidades implementadas:

- Dashboard inicial
- Navigation Compose
- Cadastro de Registro Diário
- Armazenamento temporário em memória
- Dashboard dinâmico
- Retorno automático após salvar
- Testes em dispositivo físico e emulador

Próxima etapa:

- Cadastro de despesas
- Separação entre receitas e despesas
- Cálculo consolidado do lucro diário

---

## 👨‍💻 Autor

Márcio Tomazoni

Projeto criado para estudo de desenvolvimento Android com Kotlin e Jetpack Compose, aplicado ao controle financeiro de motoristas de aplicativo.
