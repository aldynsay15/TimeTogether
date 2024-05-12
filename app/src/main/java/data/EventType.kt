import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "event_type")
data class EventType(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String, // Название типа активности
)
