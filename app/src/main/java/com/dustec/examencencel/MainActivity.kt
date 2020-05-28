package com.dustec.examencencel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.dustec.examencencel.adapters.AdapterNoticias
import com.dustec.examencencel.models.NewsResponse
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val jsonString = "{\n" +
            "\"ListaNoticias\":[\n" +
            "{\n" +
            "\"Id\":70,\n" +
            "\"Status\":\"1\",\n" +
            "\"UrlImagen\":\"C210420922075843.jpeg\",\n" +
            "\"Titulo\":\"iPhone SE. Un iPhone increíble. Por menos.\",\n" +
            "\"Texto\":\"Nuevo iPhone SE 2020 pronto disponible en http://apple.com.mx \\n\\n4.7 pulgadas / botón central / chip A13 Bionic.\\n\\nEl iPhone SE llegó con todo: el chip más potente en el tamaño más popular, a un precio muy conveniente. Justo lo que estabas esperando.\\n\\n\",\n" +
            "\"UrlWeb\":\"http://apple.com.mx\",\n" +
            "\"UrlVideo\":\"6DC9A86D11080745.mp4\",\n" +
            "\"Width\":600,\n" +
            "\"Height\":1025,\n" +
            "\"ExpDate\":\"2020-05-31\"\n" +
            "},\n" +
            "{\n" +
            "\"Id\":69,\n" +
            "\"Status\":\"1\",\n" +
            "\"UrlImagen\":\"FB9E0DFA29013124.jpg\",\n" +
            "\"Titulo\":\"iPhone 11 Pro El Mejor Smartphone!!!!!!!\",\n" +
            "\"Texto\":\"Así lucirá el Nuevo iPhone 11 Pro\\nEl consenso entre todos los analistas con experiencia en anticipar los movimientos de Apple es que el gigante tecnológico presentará tres modelos análogos a los de 2018, de 5,8, 6,5 y 6,1 pulgadas (para sustituir a los iPhone XS, XS Max y XR, respectivamente). Mismos tamaños de pantalla y mismo diseño en general (con la polémica barbilla en la parte superior del frontal), y con las mayores diferencias en la parte trasera: las filtraciones apuntan a un saliente cuandrangular\",\n" +
            "\"UrlWeb\":\"https://elpais.com/tecnologia/2019/09/09/actualidad/1568030976_478249.html\",\n" +
            "\"UrlVideo\":\"762E996E95063447.mp4\",\n" +
            "\"Width\":600,\n" +
            "\"Height\":337,\n" +
            "\"ExpDate\":\"2020-11-01\"\n" +
            "},\n" +
            "{\n" +
            "\"Id\":48,\n" +
            "\"Status\":\"1\",\n" +
            "\"UrlImagen\":\"AEAAAA7D66025557.jpg\",\n" +
            "\"Titulo\":\"Nuevo Huawei nova 5t!!!\",\n" +
            "\"Texto\":\"Descubre nuevos mundos\\nHay mundos de belleza sin descubrir para aquellos con la capacidad de verlos. La lente macro te permite tomar fotos en primer plano tan cerca como a 4 cm de distancia del objetivo, lo que te permite explorar y compartir las pequeñas maravillas que nos rodean. \\n\\nCámaras profesionales\\nen tu bolsillo\\nLas cuatro cámaras IA montadas en la parte trasera del HUAWEI nova 5T capturan fotos en alta definición, ultra gran angular, macro y Bokeh, además de videos increíbles. Podrás obtener foto\",\n" +
            "\"UrlWeb\":\"https://consumer.huawei.com/mx/phones/nova-5t/?gclid=EAIaIQobChMImcef88mk6AIVRZyzCh3j_gQ0EAAYASAAEgJwNPD_BwE\",\n" +
            "\"UrlVideo\":\"81B5F16613025615.mp4\",\n" +
            "\"Width\":600,\n" +
            "\"Height\":536,\n" +
            "\"ExpDate\":\"2020-06-06\"\n" +
            "},\n" +
            "{\n" +
            "\"Id\":17,\n" +
            "\"Status\":\"1\",\n" +
            "\"UrlImagen\":\"AEAAAA7D47033138.jpg\",\n" +
            "\"Titulo\":\"Samsung confirma que su teléfono plegable llega este año\",\n" +
            "\"Texto\":\"Los principales fabricantes de teléfonos llevan tiempo compitiendo por ser los primeros en estrenar un teléfono 100 por ciento plegable. Unas veces Huawei ha tomado la delantera, asegurando que se adelantaría a su gran rival, el gigante coreano Samsung, pero hasta ahora, nadie había puesto una fecha concreta sobre la mesa. Samsung es la ley!!!\",\n" +
            "\"UrlWeb\":\"https://www.cnet.com/es/noticias/samsung-confirma-que-su-telefono-plegable-llega-este-ano-reporte/\",\n" +
            "\"UrlVideo\":\"784888E72063632.mp4\",\n" +
            "\"Width\":600,\n" +
            "\"Height\":536,\n" +
            "\"ExpDate\":\"2020-09-30\"\n" +
            "}\n" +
            "],\n" +
            "\"Path\":\"https://cencelgo.s3.amazonaws.com/newsPath/\",\n" +
            "\"CodRet\":0,\n" +
            "\"Message\":\"Proceso exitoso\"\n" +
            "}"


    private val adapterNoticias = AdapterNoticias()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsResponse = Gson().fromJson<NewsResponse>(jsonString,NewsResponse::class.java)

        rvMainActivity.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMainActivity.adapter = adapterNoticias

        adapterNoticias.items = newsResponse.news
    }
}
