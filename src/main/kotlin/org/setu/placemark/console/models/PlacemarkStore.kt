import org.setu.placemark.console.models.PlacemarkModel

interface PlacemarkStore {
    fun findAll(): List<PlacemarkModel>
    fun findOne(id: Long): PlacemarkModel?
    fun create(placemark: PlacemarkModel)
    fun update(placemark: PlacemarkModel)
    fun delete(placemark: PlacemarkModel)
}