class Matrix {
	int matrix[][];
	int row,column,count=0;
	
	public Matrix(int row,int column){
		this.row = row;
		this.column = column;
		this.matrix = new int[this.row][this.column];
	}

	public void populate(int[] input){
		for (int i=0;i<this.row ;i++ ) {
			for (int j=0;j<this.column;j++) {
				this.matrix[i][j] = input[count];
				count++;
			}
		}
	}

	public Matrix add(Matrix first){
		Matrix destination = new Matrix(this.row,this.column);
		for (int i=0;i<first.row;i++) {
			for (int j=0;j<first.column;j++) {
				destination.matrix[i][j] = this.matrix[i][j]+first.matrix[i][j];				
			}
		}
		return destination;
	}

	public Matrix multiply(Matrix first){
		Matrix destination = new Matrix(this.row,this.column);
		for (int i = 0; i < first.row; i++) {
           for (int j = 0; j < this.column; j++) {
               for (int k = 0; k < first.column; k++) {
                   destination.matrix[i][j] += first.matrix[i][k] * this.matrix[k][j];
               }
           }
       }
       return destination;
	}

}