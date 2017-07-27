package com.example.mathe.appsimposiohumanidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Palestrantes extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palestrantes);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Palestrantes");
    }

    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Prof. Ms. Allan Kenji Seki");
        listDataHeader.add("Prof(a). Ana Maria Said");
        listDataHeader.add("Profa. Msa. Angela Adelaide Lucena");
        listDataHeader.add("Cícero Santiago de Oliveira");
        listDataHeader.add("Prof. Davis Moreira Alvim");
        listDataHeader.add("Dharla Raupp Kamers");
        listDataHeader.add("Prof. Ms. Emerson Martins");
        listDataHeader.add("Prof(a). Msa. Izabel Rizzi Mação  ");
        listDataHeader.add("Prof. Dr. Joel José de Souza");
        listDataHeader.add("Prof. Dr. José Clovis de Azevedo Olinda Evangelista");
        listDataHeader.add("Prof(a). Dra. Karina Klinke");
        listDataHeader.add("Prof(a). Msa. Maria Lucila Horn");
        listDataHeader.add("Prof. Esp. Mauro Antônio do Nascimento");
        listDataHeader.add("Nei d´ Ogum ");
        listDataHeader.add("Profa. Dra. Olinda Evangelista");
        listDataHeader.add("Prof. Ms. Paulo Henrique Schlickmann");
        listDataHeader.add("Rafael Ferreira da Silva");
        listDataHeader.add("Prof. Dr. Vilson Cesar Schenato");


        // Adding child data
        List<String> allankenji =new ArrayList<String>();
        allankenji.add("Possui graduação em Psicologia pela Universidade Federal de Santa Catarina (2011) e mestrado em Educação, Estado e Políticas Públicas pela Universidade Federal de Santa Catarina (2014). Atualmente é representante da Universidade Federal de Santa Catarina. Tem experiência na área de Educação, com ênfase em Política Educacional, atuando principalmente nos seguintes temas: políticas públicas em educação, universidade, marxismo, mais educação e teoria do valor.");

        List<String> anamaria =new ArrayList<String>();
        anamaria.add("Possui graduação em Filosofia pela Pontifícia Universidade Católica de Campinas (1980), mestrado em Filosofia pela Universidade Estadual de Campinas (1989) e doutorado em Educação, na área Educação, Sociedade, Política e Cultura, pela Universidade Estadual de Campinas (2006). Pesquisa de 1 ano no Istituto Gramsci - Roma - It, em 1993. Fez pós-doutorado em Roma-It, na Universitá degli Studi di Roma &quot;Tor Vergata&quot; (2008), com bolsa CAPES. Publicou em 2009 o livro: &quot;Uma estratégia para o ocidente: o conceito de democracia em Gramsci e o PCB&quot;. Atualmente é professor titular da Universidade Federal de Uberlândia. Coordena um grupo de estudos do CNPQ: Grupo de estudos marxistas:Marx e Gramsci.É membro do grupo de estudiosos marxistas ligado à Fondazione Gramsci dellEmilia-Romagna (www.iger.org), coordenado pela Profa. Rita Medici, desde 2011. Organizou o livro em 2014: &quot;Pensar a sociedade contemporânea - a atualidade do pensamento de Marx e Gramsci&quot;.É professora da pós-graduação em Filosofia do Instituto de Filosofia da UFU. Tem experiência na área de Filosofia, com ênfase em Política, atuando principalmente nos seguintes temas: Filosofia, Política, Educação, Marx, Antonio Gramsci, Contemporaneidade e Democracia. Aprovada em concurso para Professor Titular em 10/09/2015.");

        List<String> angelaadelaide =new ArrayList<String>();
        angelaadelaide.add("Possui graduação em Bacharel Em Direito pela Universidade de Caxias do Sul (1985) e mestrado em Direito pela Universidade de Caxias do Sul (2005). É professora na Universidade de Caxias do Sul desde agosto de 1994. Tem experiência na área de Direito, com ênfase em Direito Previdenciário e Direito Internacional Público, atuando como advogada, desde 1985, principalmente nas seguintes áreas:direito civil, sociedade limitadas, direito previdenciário e direito internacional.");

        List<String> cicerosantiago  =new ArrayList<String>();
        cicerosantiago.add("Possui graduação em História Licenciatura Plena pela Universidade Federal de Santa Maria (2004) e mestrado em Programa de Pós-Graduação em Educação pela Universidade Federal de Santa Maria (2009). Atualmente é professor do Instituto Federal de Educação Ciência e Tecnologia de Santa Catarina. Tem experiência na área de Educação, com ênfase em Administração de Unidades Educativas, atuando principalmente nos seguintes temas: educação de jovens e adultos, educação popular, pré-vestibular popular, ensino de história e cidadania.");

        List<String> davismoreira =new ArrayList<String>();
        davismoreira.add("Possui graduação em História pela Universidade Federal do Espírito Santo (2000), mestrado em História Social das Relações Políticas pela Universidade Federal do Espírito Santo (2004), doutorado em Filosofia pela Pontifícia Universidade Católica de São Paulo (2011) e está pós-doutorando em Psicologia Institucional pela Universidade Federal do Espírito Santo (2016). É professor efetivo do Instituto Federal do Espírito Santo (Ifes), campus Linhares, do Programa de Pós-Graduação em Ensino de Humanidades (Ifes), campus Vitória, e do Programa de Psicologia Institucional (Ufes). É líder do grupo de pesquisa Educação Contemporânea: diversidade, crítica e transformação (Ifes) e pesquisador do grupo Tecnologias e processos de subjetivação (Unesp). Membro do Grupo de Estudos e Pesquisas em Sexualidade da Ufes, do Núcleo de Pesquisa em Sexualidade da Ufes e do Coletivo Colorifes.");

        List<String> dharlaraupp =new ArrayList<String>();
        dharlaraupp.add("?????????????");

        List<String> emersonmartins  =new ArrayList<String>();
        emersonmartins.add("É professor Assistente II na Universidade da Fronteira Sul (UFFS), na área de Ciências Sociais e Ciência Política. É doutorando do Programa de Pós-Graduação em Psicologia pela Universidade Federal de Santa Catarina (UFSC) e possui mestrado em Sociologia Política (UFSC). Tem experiência na área de Sociologia Política, com ênfase em políticas educacionais inclusivas, atuando principalmente nos seguintes temas: participação política, relações interétnicas, orientação sexual, gênero, masculinidades, educação,violências, novas tecnologias de informação e comunicação (NTI) e cultura surda.");

        List<String> izabelrizzi =new ArrayList<String>();
        izabelrizzi.add("Possui graduação em História/Licenciatura Plena e Bacharelado pelo Centro de Ensino Superior Anísio Teixeira (2009) e Mestrado em História pela Universidade Federal do Espírito Santo (2016). Possui experiência com Ensino Fundamental, Médio, Educação de Jovens e Adultos e Ensino Superior. Tem pesquisa e artigos publicados na área de História das Relações de Poder, Política e Pós-Modernidade, Filosofia Contemporânea, História de Gênero e Literatura e História.");

        List<String> joeljose =new ArrayList<String>();
        joeljose.add("Professor do Instituto Federal de Santa Catarina, possui graduação em Geografia pela Universidade Federal de Santa Catarina (2006), mestrado em Geografia pela Universidade Federal de Santa Catarina (2009), doutor em Geografia pela Universidade Federal de Santa Catarina (2014). Atualmente e participa de grupos de pesquisa na Universidade Federal de Santa Catarina, Instituto Federal de Santa Catarina e Universidade Federal da Integração Latino-Americana. Tem experiência na área de Geografia, como professor de Ensino básico, médio, EJA e Ensino Superior a Distância. Como pesquisador atua na área de desenvolvimento regional e urbano, com ênfase em Geografia Econômica e Rural, atuando nos seguintes temas: industrialização, laticínios e agroindústria.");

        List<String> joseclovis =new ArrayList<String>();
        joseclovis.add("??????????????");

        List<String> karinaklinke = new ArrayList<String>();
        karinaklinke.add("Licenciada em Pedagogia pela Universidade Federal de Goiás (1995), Mestre em Educação pela Universidade Federal de Minas Gerais (1998), Doutora em Educação pela Universidade Federal de Minas Gerais (2003), Pós-Doutora em História Moderna e Contemporânea pelo IFCH-UNICAMP (2009). Credenciada no Programa de Pós-Graduação em Educação da Universidade Federal de Uberlândia, na Linha de Pesquisa ESTADO, POLÍTICAS E GESTÃO EM EDUCAÇÃO. Professor Associado III da Universidade Federal de Uberlândia, FACIP. Líder do Grupo de Estudos em Políticas de Leitura, Escrita, Livros e Linguagens (GEPLELL). Editora da Revista Educação e Políticas em Debate (PPGED/FACED/UFU). Coordenadora da Linha de Pesquisa Estado, Políticas e Gestão da Educação (PPGED/FACED/UFU). Experiência nas áreas de História e Políticas Públicas com ênfase nos seguintes temas: história da leitura, avaliação de políticas educacionais, gênero, educação de pessoas jovens e adultas, educação popular.");

        List<String> marialucila =new ArrayList<String>();
        marialucila.add("Artista, curadora, arte educadora. Licenciada em Artes Visuais pela Universidade do Estado de Santa Catarina (1988), Aperfeiçoamento em Pintura (1994), Especialização em Arte e ciências Humanas (2001), especialização em Fotografia e Imagem em Movimento (2012) e mestrado em Educação e Cultura pela Universidade do Estado de Santa Catarina (2006). Atualmente é doutoranda do Programa de pós-graduação em educação - PPGE/UDESC, membro do grupo de pesquisa &quot;Arte, Formação e tecnologias nos processos contemporâneos&quot; e coordenadora do Núcleo de Estudos em Fotografia e Arte. Tem experiência na área de Artes, com ênfase em linguagem visual e fotografia, atuando principalmente nos seguintes temas: arte, fotografia, pintura, educação e educação a distância.");

        List<String> mauroantonio =new ArrayList<String>();
        mauroantonio.add("Bacharel e Licenciado em Filosofia pela Universidade Federal de Uberlândia/UFU. Especialista em Ensino de Filosofia pela Universidade do Oeste \tPaulista/UNOESTE. Mestrando em Educação Profissional e Tecnológica em Rede Nacional (ProfEPT). Professor de Filosofia do Instituto Federal de Santa \tCatarina-IFSC com dedicação excluisiva. Coordenador do Núcleo de Cultura e Arte (NuCA) do Campus Canoinhas/IFSC e do projeto de Extensão IFSC SESC em \tAtos. Autor do livro Ser e Declínio e organizador do livro Aproximação-Distância. Foi sócio fundador e administrador da empresa Agência Arte \tProdutora e responsável pela concepção e produção executiva dos projetos: Bienal de Arte do Triângulo, Congresso de Arte e Produção Cultural do \tTriângulo e Alto Paranaíba, Simpósio de Arte e Produção Cultural de Uberlândia.");

        List<String> neid  =new ArrayList<String>();
        neid.add("????????????????");

        List<String> olindaevangelista =new ArrayList<String>();
        olindaevangelista.add("Possui graduação em Filosofia pela Universidade Federal do Paraná (1980), mestrado em Educação: História, Política, Sociedade pela Pontifícia Universidade Católica de São Paulo (1988) e doutorado em Educação: História, Política, Sociedade pela Pontifícia Universidade Católica de São Paulo (1997). Realizou Estágio Pós-doutoral na Universidade do Minho, Braga, PT. Atualmente é professor aposentado da Universidade Federal de Santa Catarina e Voluntária no PPGE-CED-UFSC. Tem experiência na área de Educação, com ênfase em Educação, atuando principalmente nos seguintes temas: política educacional, formação docente, educação, política de educação e história da educação.");

        List<String> paulohenrique =new ArrayList<String>();
        paulohenrique.add("É licenciado em Geografia pela Universidade do Sul de Santa Catarina (2009), Mestre em Geografia - Desenvolvimento Regional e Urbano - com \tdissertação sobre as dinâmicas geoeconômicas das indústrias de plástico da região Sul de Santa Catarina, com enfase em São Ludgero - SC, pela \tUniversidade Federal de Santa Catarina (2012). Atualmente é doutorando do Programa de Pós Graduação em Geografia da Universidade Federal de Santa \tCatarina, com pesquisa em andamento sobre as indústrias petroquímicas do Brasil, com enfase na Cadeia Produtiva petroquímica, sua dinâmica \tgeoeconômica, internacionalização e competitividade. Tem experiência no ensino superior pela Universidade Federal de Santa Catarina (UFSC) nos cursos \tde Geografia e Pedagogia (Estágios e Prática de Ensino). Atualmente participa como estudante do grupo de estudos Formação Sócio Espacial: Progresso \tTécnico e Desenvolvimento Econômico, e também participa como pesquisador do grupo de estudo Geografia e processos educativos.");

        List<String> rafaelferreira =new ArrayList<String>();
        rafaelferreira.add("????????????????");

        List<String> vilsoncesar = new ArrayList<String>();
        vilsoncesar.add("Doutor em Ciências Sociais pela Universidade Federal de Campina Grande - UFCG, possui Mestrado em Ciências Sociais pela mesma instituição (2010). É graduado em Ciências Sociais pela Universidade Estadual do Oeste do Paraná (2003) e especialista em História e Região também pela UNIOESTE (2005). Professor efetivo de Sociologia no Instituto Federal de Santa Catarina. Tem experiência docente em Sociologia e Antropologia. Enquanto pesquisador se concentra nos seguintes temas: Teoria Sociológica; Campesinato, Grupos Sociais Rurais; Oeste Paranaense; Agreste Paraibano; Construções Identitárias e Relações Sócio-culturais; Direitos Humanos; Educação, Trabalho e Realidade Brasileira. Líder do Grupo de Pesquisa: Identidades, Desenvolvimento e Democracia (Certificado pelo CNPq).");


        listDataChild.put(listDataHeader.get(0), allankenji);
        listDataChild.put(listDataHeader.get(1), anamaria);
        listDataChild.put(listDataHeader.get(2), angelaadelaide);
        listDataChild.put(listDataHeader.get(3), cicerosantiago);
        listDataChild.put(listDataHeader.get(4), davismoreira);
        listDataChild.put(listDataHeader.get(5), dharlaraupp);
        listDataChild.put(listDataHeader.get(6), emersonmartins);
        listDataChild.put(listDataHeader.get(7), izabelrizzi);
        listDataChild.put(listDataHeader.get(8), joeljose);
        listDataChild.put(listDataHeader.get(9), joseclovis);
        listDataChild.put(listDataHeader.get(10), karinaklinke);
        listDataChild.put(listDataHeader.get(11), marialucila);
        listDataChild.put(listDataHeader.get(12), mauroantonio);
        listDataChild.put(listDataHeader.get(13), neid);
        listDataChild.put(listDataHeader.get(14), olindaevangelista);
        listDataChild.put(listDataHeader.get(15), paulohenrique);
        listDataChild.put(listDataHeader.get(16), rafaelferreira);
        listDataChild.put(listDataHeader.get(17), vilsoncesar); // Header, Child data

    }
}
