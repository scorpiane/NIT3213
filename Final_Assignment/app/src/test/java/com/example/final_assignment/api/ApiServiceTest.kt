// src/test/java/com/example/final_assignment/api/ApiServiceTest.kt

import com.example.final_assignment.api.ApiService
import com.example.final_assignment.models.DashboardResponse
import com.example.final_assignment.models.EntityDetails
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import retrofit2.Call
import retrofit2.Response
import kotlin.test.assertEquals

class ApiServiceTest {

    private lateinit var apiService: ApiService
    private lateinit var mockCall: Call<DashboardResponse>

    @Before
    fun setUp() {
        apiService = mock(ApiService::class.java)
        mockCall = mock(Call::class.java) as Call<DashboardResponse>
    }

    @Test
    fun `test getEntities success`() {
        // Create a mock response
        val mockEntities = listOf(
            EntityDetails("Mona Lisa", "Leonardo da Vinci", "Oil paint", 1503, "A half-length portrait painting of a woman with an enigmatic smile, considered one of the most famous paintings in the world."),
            EntityDetails("The Starry Night", "Vincent van Gogh", "Oil paint", 1889, "A post-impressionist painting depicting a night scene with swirling clouds, stars, and a crescent moon over a sleeping village."),
            EntityDetails("The Persistence of Memory", "Salvador Dalí", "Oil paint", 1931, "A surrealist painting featuring melting clocks in a dreamlike landscape, exploring the concept of time and memory."),
            EntityDetails("Guernica", "Pablo Picasso", "Oil paint", 1937, "A large anti-war painting depicting the bombing of Guernica, Spain, during the Spanish Civil War."),
            EntityDetails("The Scream", "Edvard Munch", "Oil paint, tempera, pastel and crayon", 1893, "An expressionist painting depicting an agonized figure against a landscape with a swirling orange sky."),
            EntityDetails("The Birth of Venus", "Sandro Botticelli", "Tempera on canvas", 1485, "A Renaissance painting depicting the goddess Venus emerging from the sea as a fully grown woman."),
            EntityDetails("Girl with a Pearl Earring", "Johannes Vermeer", "Oil paint", 1665, "A tronie of a girl wearing an exotic dress, an oriental turban, and a large pearl earring.")
        )
        val mockResponse = DashboardResponse(mockEntities, mockEntities.size)

        // Set up the mock call
        `when`(mockCall.execute()).thenReturn(Response.success(mockResponse))
        `when`(apiService.getEntities()).thenReturn(mockCall)

        // Perform the API call
        val response = apiService.getEntities().execute()

        // Validate the results
        assertEquals(mockResponse, response.body())
        verify(apiService).getEntities()
    }
}
