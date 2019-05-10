
public class Vertex {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The vertex number
   */
  int vertexNum;
  
  /**
   * The weight of the edge.
   * 
   * */
  private int pathWeight;
  /*
   * Previous vertex
   */
  int prevVertex;
  
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new edge with a specified weight.
   */
  public Vertex(int vertexNum, int distance, int prevVertex) {
    this.prevVertex = prevVertex;
    this.pathWeight = distance;
    this.vertexNum = vertexNum;
  } 
  
  /**
   * Methods
   */
  public int pathWeight() {
    return this.pathWeight;
  }
  
} 
